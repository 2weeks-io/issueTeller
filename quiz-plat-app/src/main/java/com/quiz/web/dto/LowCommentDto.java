package com.quiz.web.dto;

import java.util.Date;

public class LowCommentDto extends BaseDto{

	private int    writing_no;         //게시글번호
	private int    comment_no;         //댓글번호
	private String comment_content;    //댓글내용
	private int    recom_num;          //좋아요수
	private int    hate_num;           //싫어요수
	private String nickname;           //닉네임
	private String choice1;            //선택지1
	private String choice2;            //선택지2
	private int    depth;              //0: 댓글, 1:대댓글
	private Integer parent;            //대댓글 상위 댓글 번호
	private	Integer vote;              //1:찬성, 2:반대
	private int    sum_prefer;         //좋아요 - 싫어요 수 합
	private boolean isMine;            //내가쓴 댓글일경우 true, 아니면 false
	private String prefer;             //0:댓글좋아요, 1:댓글싫어요, null: 선호 선택x
	private String use_yn;             //댓글 사용여부
	private boolean isSuccess;         //댓글 삭제 성공여부
	
	public int getSum_prefer() {
		return sum_prefer;
	}
	public void setSum_prefer(int sum_prefer) {
		this.sum_prefer = sum_prefer;
	}
	public Integer getVote() {
		return vote;
	}
	public void setVote(Integer vote) {
		this.vote = vote;
	}
	public int getWriting_no() {
		return writing_no;
	}
	public void setWriting_no(int writing_no) {
		this.writing_no = writing_no;
	}
	public int getComment_no() {
		return comment_no;
	}
	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	public int getRecom_num() {
		return recom_num;
	}
	public void setRecom_num(int recom_num) {
		this.recom_num = recom_num;
	}
	public int getHate_num() {
		return hate_num;
	}
	public void setHate_num(int hate_num) {
		this.hate_num = hate_num;
	}
	public boolean isMine() {
		return isMine;
	}
	public void setMine(boolean isMine) {
		this.isMine = isMine;
	}
	public String getPrefer() {
		return prefer;
	}
	public void setPrefer(String prefer) {
		this.prefer = prefer;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getChoice1() {
		return choice1;
	}
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	public String getChoice2() {
		return choice2;
	}
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
}
