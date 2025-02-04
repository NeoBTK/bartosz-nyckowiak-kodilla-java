package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsModuleTestSuite {

    @Mock
    private Statistics statisticsMock;

    private ForumStatistics forumStatistics;

    private List<String> generateListOfNUsernames (int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            resultList.add("User" + n);
        }
        return resultList;
    }

    @BeforeEach
    void setUp() {
        statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }

    @Test
    void testCalculateStatisticsWithZeroPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStatistics.getUserCount());
        assertEquals(0, forumStatistics.getPostCount());
        assertEquals(10, forumStatistics.getCommentCount());
        assertEquals(0, forumStatistics.getAvgPostsPerUser());
        assertEquals(2, forumStatistics.getAvgCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWithThousandPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1500);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStatistics.getUserCount());
        assertEquals(1000, forumStatistics.getPostCount());
        assertEquals(1500, forumStatistics.getCommentCount());
        assertEquals(200, forumStatistics.getAvgPostsPerUser());
        assertEquals(300, forumStatistics.getAvgCommentsPerUser());
        assertEquals(1.5, forumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWithZeroComments() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStatistics.getUserCount());
        assertEquals(50, forumStatistics.getPostCount());
        assertEquals(0, forumStatistics.getCommentCount());
        assertEquals(10, forumStatistics.getAvgPostsPerUser());
        assertEquals(0, forumStatistics.getAvgCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWhenCommentsLessThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStatistics.getUserCount());
        assertEquals(50, forumStatistics.getPostCount());
        assertEquals(0, forumStatistics.getCommentCount());
        assertEquals(10, forumStatistics.getAvgPostsPerUser());
        assertEquals(0, forumStatistics.getAvgCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWhenCommentsGreaterThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(50);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStatistics.getUserCount());
        assertEquals(10, forumStatistics.getPostCount());
        assertEquals(50, forumStatistics.getCommentCount());
        assertEquals(2, forumStatistics.getAvgPostsPerUser());
        assertEquals(10, forumStatistics.getAvgCommentsPerUser());
        assertEquals(5, forumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWithZeroUsers() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(0));
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUserCount());
        assertEquals(10, forumStatistics.getPostCount());
        assertEquals(10, forumStatistics.getCommentCount());
        assertEquals(0, forumStatistics.getAvgPostsPerUser());
        assertEquals(0, forumStatistics.getAvgCommentsPerUser());
        assertEquals(1, forumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWithHundredUsers() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(100));
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(400);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUserCount());
        assertEquals(200, forumStatistics.getPostCount());
        assertEquals(400, forumStatistics.getCommentCount());
        assertEquals(2, forumStatistics.getAvgPostsPerUser());
        assertEquals(4, forumStatistics.getAvgCommentsPerUser());
        assertEquals(2, forumStatistics.getAvgCommentsPerPost());
    }
}
