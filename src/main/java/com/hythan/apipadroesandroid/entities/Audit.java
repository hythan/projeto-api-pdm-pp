package com.hythan.apipadroesandroid.entities;


import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class Audit {

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    @Column(name = "delete_at")
    private Date deleteAt;

    public Date getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

     void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @PrePersist
    public void onPrePersist(){
        setCreateAt(new Date());
    }

    @PreUpdate
    public void onPreUpdate(){
        setCreateAt(new Date());
    }

    @PreRemove
    public  void onPreRemove(){
        setCreateAt(new Date());
    }


}
