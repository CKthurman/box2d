package font.com;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Box2dgame extends ApplicationAdapter {
	private boolean DEBUG = false;
	float width, height;

	@Override
	public void create() {
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();

	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
	

	@Override
	public void dispose() {

	}
}