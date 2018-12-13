package com.practice.vo;

public class TAnswer {
    private Long id;

    private Long topicId;

    private Byte anSeq;

    private Byte anType;

    private Long anId;

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

    public Byte getAnSeq() {
        return anSeq;
    }

    public void setAnSeq(Byte anSeq) {
        this.anSeq = anSeq;
    }

    public Byte getAnType() {
        return anType;
    }

    public void setAnType(Byte anType) {
        this.anType = anType;
    }

    public Long getAnId() {
        return anId;
    }

    public void setAnId(Long anId) {
        this.anId = anId;
    }
}