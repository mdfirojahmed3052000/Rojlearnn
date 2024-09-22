package com.rojlearnn.rojlearnn.model.Addon;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ratings")
public class Rateing {

    private ObjectId _id;
    private int rating;
    private String cuid;
    private ObjectId contentid;
    private LocalDateTime created_at = LocalDateTime.now();

    public Rateing() {
    }
    public Rateing(int rating, String cuid, ObjectId contentid) {
        this.rating = rating;
        this.cuid = cuid;
        this.contentid = contentid ;//contentid;
    }
    public String get_id() {
        return _id.toString();
    }
    public void set_id(ObjectId _id) {
        this._id = _id;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getCuid() {
        return cuid;
    }
    public void setCuid(String cuid) {
        this.cuid = cuid;
    }
    public String getContentid() {
        return contentid.toString();
    }
    public void setContentid(String contentid) {
        this.contentid = new ObjectId(contentid) ;// contentid;
    }
    public LocalDateTime getCreated_at() {
        return created_at;
    }
    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

}

