package com.editspace.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;


public class celldustry extends ApplicationAdapter {
    private Texture cell;
    private Texture protein;
    private Sound eatsound;
    private Music speed;

    @Override
    public void create(){
        cell = new Texture(Gdx.files.internal("cell.png"));
        protein = new Texture(Gdx.files.internal("protein.png"));

        eatsound = new  Gdx.audio.newSound(Gdx.files.internal("eatsound.mp3"));
        speed = new Gdx.audio.newMusic(Gdx.files.internal("speed.mp3"));

        speed.setLooping(true);
        speed.play();
    }



}
