package ru.pin_ka.pool;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import ru.pin_ka.base.SpritesPool;
import ru.pin_ka.math.Rect;
import ru.pin_ka.sprite.game.Ink;
import ru.pin_ka.sprite.game.Ship;

public class InkPool extends SpritesPool <Ink> {

    private TextureAtlas atlas;
    private Rect worldBounds;
    private ExplosionPool explosionPool;
    private Ship ship;
    private Sound explosionSound;

    public InkPool (TextureAtlas atlas,Rect worldBounds, ExplosionPool explosionPool, Ship ship) {
        this.atlas=atlas;
        this.explosionPool=explosionPool;
        this.worldBounds=worldBounds;
        this.ship=ship;
        this.explosionSound=Gdx.audio.newSound(Gdx.files.internal("sounds/ou.wav"));
    }


    @Override
    protected Ink newObject() {
        return new Ink(atlas,worldBounds,explosionPool,ship,explosionSound);
    }

    @Override
    public void dispose() {
        super.dispose();
        explosionSound.dispose();
    }
}
