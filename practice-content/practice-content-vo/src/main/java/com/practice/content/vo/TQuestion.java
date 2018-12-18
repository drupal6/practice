package com.practice.content.vo;

public class TQuestion {
    private Long id;

    private Long topicId;

    private Byte qSeq;

    private Byte qType;

    private Long qId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Byte getqSeq() {
        return qSeq;
    }

    public void setqSeq(Byte qSeq) {
        this.qSeq = qSeq;
    }

    public Byte getqType() {
        return qType;
    }

    public void setqType(Byte qType) {
        this.qType = qType;
    }

    public Long getqId() {
        return qId;
    }

    public void setqId(Long qId) {
        this.qId = qId;
    }
}