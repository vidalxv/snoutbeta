package com.snout.beta.O;

/* loaded from: C:\Users\vidal\AppData\Local\Temp\jadx-5663182869562980310.dex */
public class ObjetoFeed {
    public String data;
    public String descricao;
    public String titulo;
    public String user_id;
    private String videoUrl;

    public ObjetoFeed(String videoUrl, String titulo, String descricao, String data, String user_id) {
        this.user_id = user_id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
