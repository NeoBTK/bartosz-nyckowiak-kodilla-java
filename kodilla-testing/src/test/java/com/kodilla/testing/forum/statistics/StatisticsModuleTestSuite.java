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

//    private ForumStatistics forumStatistics;

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
//        forumStatistics = new ForumStatistics();
    }

    @Test
    void testCalculateStatisticsWithZeroPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, ForumStatistics.getUserCount());
        assertEquals(0, ForumStatistics.getPostCount());
        assertEquals(10, ForumStatistics.getCommentCount());
        assertEquals(0, ForumStatistics.getAvgPostsPerUser());
        assertEquals(2, ForumStatistics.getAvgCommentsPerUser());
        assertEquals(0, ForumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWithThousandPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1500);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, ForumStatistics.getUserCount());
        assertEquals(1000, ForumStatistics.getPostCount());
        assertEquals(1500, ForumStatistics.getCommentCount());
        assertEquals(200, ForumStatistics.getAvgPostsPerUser());
        assertEquals(300, ForumStatistics.getAvgCommentsPerUser());
        assertEquals(1.5, ForumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWithZeroComments() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, ForumStatistics.getUserCount());
        assertEquals(50, ForumStatistics.getPostCount());
        assertEquals(0, ForumStatistics.getCommentCount());
        assertEquals(10, ForumStatistics.getAvgPostsPerUser());
        assertEquals(0, ForumStatistics.getAvgCommentsPerUser());
        assertEquals(0, ForumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWhenCommentsLessThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, ForumStatistics.getUserCount());
        assertEquals(50, ForumStatistics.getPostCount());
        assertEquals(0, ForumStatistics.getCommentCount());
        assertEquals(10, ForumStatistics.getAvgPostsPerUser());
        assertEquals(0, ForumStatistics.getAvgCommentsPerUser());
        assertEquals(0, ForumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWhenCommentsGreaterThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(5));
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(50);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, ForumStatistics.getUserCount());
        assertEquals(10, ForumStatistics.getPostCount());
        assertEquals(50, ForumStatistics.getCommentCount());
        assertEquals(2, ForumStatistics.getAvgPostsPerUser());
        assertEquals(10, ForumStatistics.getAvgCommentsPerUser());
        assertEquals(5, ForumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWithZeroUsers() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(0));
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, ForumStatistics.getUserCount());
        assertEquals(10, ForumStatistics.getPostCount());
        assertEquals(10, ForumStatistics.getCommentCount());
        assertEquals(0, ForumStatistics.getAvgPostsPerUser());
        assertEquals(0, ForumStatistics.getAvgCommentsPerUser());
        assertEquals(1, ForumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateStatisticsWithHundredUsers() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsernames(100));
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(400);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, ForumStatistics.getUserCount());
        assertEquals(200, ForumStatistics.getPostCount());
        assertEquals(400, ForumStatistics.getCommentCount());
        assertEquals(2, ForumStatistics.getAvgPostsPerUser());
        assertEquals(4, ForumStatistics.getAvgCommentsPerUser());
        assertEquals(2, ForumStatistics.getAvgCommentsPerPost());
    }
}
