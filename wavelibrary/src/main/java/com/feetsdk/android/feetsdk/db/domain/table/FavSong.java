package com.feetsdk.android.feetsdk.db.domain.table;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by cuieney on 16/11/30.
 */
@Entity
public class FavSong {
    @Id
    private String songId;

    private String songName;

    private String coverImageUrl;

    private int progress;

    private String mp3Url;

    private String path;

    private String singerName;

    private String tempo;

    private int size;

    private boolean collection;

    private int imgProgress;
    private String imgPath;

    @Generated(hash = 347123745)
    public FavSong(String songId, String songName, String coverImageUrl,
            int progress, String mp3Url, String path, String singerName,
            String tempo, int size, boolean collection, int imgProgress,
            String imgPath) {
        this.songId = songId;
        this.songName = songName;
        this.coverImageUrl = coverImageUrl;
        this.progress = progress;
        this.mp3Url = mp3Url;
        this.path = path;
        this.singerName = singerName;
        this.tempo = tempo;
        this.size = size;
        this.collection = collection;
        this.imgProgress = imgProgress;
        this.imgPath = imgPath;
    }

    @Generated(hash = 268062656)
    public FavSong() {
    }

    public String getSongId() {
        return this.songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return this.songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getMp3Url() {
        return this.mp3Url;
    }

    public void setMp3Url(String mp3Url) {
        this.mp3Url = mp3Url;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSingerName() {
        return this.singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getTempo() {
        return this.tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "FavSong{" +
                "songId='" + songId + '\'' +
                ", songName='" + songName + '\'' +
                ", coverImageUrl='" + coverImageUrl + '\'' +
                ", progress=" + progress +
                ", mp3Url='" + mp3Url + '\'' +
                ", path='" + path + '\'' +
                ", singerName='" + singerName + '\'' +
                ", tempo='" + tempo + '\'' +
                ", size=" + size +
                ", collection=" + collection +
                ", imgProgress=" + imgProgress +
                '}';
    }

    public boolean getCollection() {
        return this.collection;
    }

    public void setCollection(boolean collection) {
        this.collection = collection;
    }

    public int getImgProgress() {
        return this.imgProgress;
    }

    public void setImgProgress(int imgProgress) {
        this.imgProgress = imgProgress;
    }

    public String getImgPath() {
        return this.imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
