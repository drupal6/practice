package com.practice.content.vo;

public class TAnswerSelectionOptional {
    private Long id;

    private Byte seq;

    private Long answerTextId;

    private Byte resourceType;

    private Byte isAnswer;

    private Integer score;

    private String resource;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getSeq() {
        return seq;
    }

    public void setSeq(Byte seq) {
        this.seq = seq;
    }

    public Long getAnswerTextId() {
        return answerTextId;
    }

    public void setAnswerTextId(Long answerTextId) {
        this.answerTextId = answerTextId;
    }

    public Byte getResourceType() {
        return resourceType;
    }

    public void setResourceType(Byte resourceType) {
        this.resourceType = resourceType;
    }

    public Byte getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(Byte isAnswer) {
        this.isAnswer = isAnswer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }
}