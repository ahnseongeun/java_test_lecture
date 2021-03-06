package com.test_java.junit5.lecture3;

import com.test_java.junit5.lecture2.StudyStatus;

public class Study {

    private StudyStatus studyStatus = StudyStatus.DRAFT;

    private int limit;

    public Study(){};

    public Study(int limit){
        //if( limit < 0)
        //    throw new IllegalArgumentException("limit은 0보다 커야 합니다.");
        this.limit = limit;
    };

    public StudyStatus getStatus() {
        return this.studyStatus;
    }

    public int getLimit() {
        return this.limit;
    }
}
