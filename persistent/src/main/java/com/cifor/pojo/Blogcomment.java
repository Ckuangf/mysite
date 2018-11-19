package com.cifor.pojo;

import java.io.Serializable;

public class Blogcomment implements Serializable {
    private Integer id;
    //也用作评论标识
    private String title;

    private String author;
    //阅读数
    private Integer readnum;
    //点赞数
    private Integer favornum;
    //不赞同数
    private Integer loathingnum;

    private Long createtime;
    //跟评ID(存放评论的json字符串：如下格式;
    // {
    //      supID:xxx;
    //      subID:[xx,xx];
    // }
    private String withcomment;

    private String commenttext;

    private String ext;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Integer getFavornum() {
        return favornum;
    }

    public void setFavornum(Integer favornum) {
        this.favornum = favornum;
    }

    public Integer getLoathingnum() {
        return loathingnum;
    }

    public void setLoathingnum(Integer loathingnum) {
        this.loathingnum = loathingnum;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public String getWithcomment() {
        return withcomment;
    }

    public void setWithcomment(String withcomment) {
        this.withcomment = withcomment == null ? null : withcomment.trim();
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext == null ? null : commenttext.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Blogcomment other = (Blogcomment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getReadnum() == null ? other.getReadnum() == null : this.getReadnum().equals(other.getReadnum()))
            && (this.getFavornum() == null ? other.getFavornum() == null : this.getFavornum().equals(other.getFavornum()))
            && (this.getLoathingnum() == null ? other.getLoathingnum() == null : this.getLoathingnum().equals(other.getLoathingnum()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getWithcomment() == null ? other.getWithcomment() == null : this.getWithcomment().equals(other.getWithcomment()))
            && (this.getCommenttext() == null ? other.getCommenttext() == null : this.getCommenttext().equals(other.getCommenttext()))
            && (this.getExt() == null ? other.getExt() == null : this.getExt().equals(other.getExt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getReadnum() == null) ? 0 : getReadnum().hashCode());
        result = prime * result + ((getFavornum() == null) ? 0 : getFavornum().hashCode());
        result = prime * result + ((getLoathingnum() == null) ? 0 : getLoathingnum().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getWithcomment() == null) ? 0 : getWithcomment().hashCode());
        result = prime * result + ((getCommenttext() == null) ? 0 : getCommenttext().hashCode());
        result = prime * result + ((getExt() == null) ? 0 : getExt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", readnum=").append(readnum);
        sb.append(", favornum=").append(favornum);
        sb.append(", loathingnum=").append(loathingnum);
        sb.append(", createtime=").append(createtime);
        sb.append(", withcomment=").append(withcomment);
        sb.append(", commenttext=").append(commenttext);
        sb.append(", ext=").append(ext);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}