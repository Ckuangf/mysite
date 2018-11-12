package com.cifor.pojo;

import java.io.Serializable;

public class Blog implements Serializable {
    private Integer id;

    private String title;

    private String author;

    private Integer readnum;

    private Integer favornum;

    private Integer loathingnum;

    private Long createtime;

    private Long lastmodefiedtime;

    private String category;

    private String trait;

    private String description;

    private String ext;

    private String maintext;

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

    public Long getLastmodefiedtime() {
        return lastmodefiedtime;
    }

    public void setLastmodefiedtime(Long lastmodefiedtime) {
        this.lastmodefiedtime = lastmodefiedtime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait == null ? null : trait.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getMaintext() {
        return maintext;
    }

    public void setMaintext(String maintext) {
        this.maintext = maintext == null ? null : maintext.trim();
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
        Blog other = (Blog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getReadnum() == null ? other.getReadnum() == null : this.getReadnum().equals(other.getReadnum()))
            && (this.getFavornum() == null ? other.getFavornum() == null : this.getFavornum().equals(other.getFavornum()))
            && (this.getLoathingnum() == null ? other.getLoathingnum() == null : this.getLoathingnum().equals(other.getLoathingnum()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLastmodefiedtime() == null ? other.getLastmodefiedtime() == null : this.getLastmodefiedtime().equals(other.getLastmodefiedtime()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getTrait() == null ? other.getTrait() == null : this.getTrait().equals(other.getTrait()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getExt() == null ? other.getExt() == null : this.getExt().equals(other.getExt()))
            && (this.getMaintext() == null ? other.getMaintext() == null : this.getMaintext().equals(other.getMaintext()));
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
        result = prime * result + ((getLastmodefiedtime() == null) ? 0 : getLastmodefiedtime().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getTrait() == null) ? 0 : getTrait().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getExt() == null) ? 0 : getExt().hashCode());
        result = prime * result + ((getMaintext() == null) ? 0 : getMaintext().hashCode());
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
        sb.append(", lastmodefiedtime=").append(lastmodefiedtime);
        sb.append(", category=").append(category);
        sb.append(", trait=").append(trait);
        sb.append(", description=").append(description);
        sb.append(", ext=").append(ext);
        sb.append(", maintext=").append(maintext);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}