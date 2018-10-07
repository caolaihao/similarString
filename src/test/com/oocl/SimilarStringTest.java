package com.oocl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimilarStringTest {
    private SimilarString similarString;
    @Before
    public void setup(){
        similarString = new SimilarString();
    }
    @Test
    public void should_return_false_when_judge_string_given_2_string_with_different_length() throws Exception {
        boolean result = similarString.isSimilarString("ab","abc");
        Assert.assertEquals(false, result);
    }

    @Test
    public void should_return_false_when_judge_string_given_same_string_specific_char() throws Exception {
        boolean result = similarString.isSimilarString("abc","abc");
        Assert.assertEquals(false, result);
    }

    @Test
    public void should_return_true_when_judge_string_given_same_string_not_specific_char() throws Exception {
        boolean result = similarString.isSimilarString("aabc","aabc");
        Assert.assertEquals(true, result);
    }

    @Test
    public void should_return_false_when_judge_string_given_2_string_3_char_different() throws Exception {
        boolean result = similarString.isSimilarString("abcdefG","abcdfge");
        Assert.assertEquals(false, result);
    }

    @Test
    public void should_return_true_when_judge_string_given_2_string_2_char_different() throws Exception {
        boolean result = similarString.isSimilarString("abcde","abced");
        Assert.assertEquals(true, result);
    }
}