package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.36w  reason: invalid class name and case insensitive filesystem */
public final class C670136w extends FrameLayout {
    public int A00 = -1;
    public AnonymousClass25O A01;
    public ExoPlaybackControlView A02;
    public C669836s A03;
    public C72433Sv A04;
    public String A05;
    public boolean A06 = false;
    public final View A07;
    public final View A08;
    public final AspectRatioFrameLayout A09;
    public final SubtitleView A0A;
    public final C72423Su A0B;
    public final boolean A0C;

    public C670136w(Context context, boolean z) {
        super(context);
        View r0;
        LayoutInflater.from(context).inflate(R.layout.wa_exoplayer_video_view, this);
        this.A0B = new C72423Su(this);
        this.A09 = (AspectRatioFrameLayout) findViewById(R.id.video_frame);
        this.A07 = findViewById(R.id.shutter);
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.subtitles);
        this.A0A = subtitleView;
        subtitleView.A00();
        this.A0A.A01();
        this.A0C = z;
        if (z) {
            r0 = new SurfaceView(context);
        } else {
            r0 = new AnonymousClass37F(context);
        }
        this.A08 = r0;
        this.A08.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.A09.addView(this.A08, 0);
        this.A04 = new C72433Sv(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ExoPlaybackControlView exoPlaybackControlView = this.A02;
        return exoPlaybackControlView != null ? exoPlaybackControlView.dispatchKeyEvent(keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    public Bitmap getCurrentFrame() {
        try {
            View view = this.A08;
            int width = view.getWidth() / 4;
            int height = view.getHeight() / 4;
            if (!this.A0C) {
                return ((TextureView) view).getBitmap(width, height);
            }
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(true);
            }
            view.buildDrawingCache(true);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(view.getDrawingCache(), width, height, true);
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(false);
            }
            view.destroyDrawingCache();
            return createScaledBitmap;
        } catch (OutOfMemoryError e) {
            Log.e("ExoPlayerView/getCurrentFrame/", e);
            return null;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        ExoPlaybackControlView exoPlaybackControlView = this.A02;
        if (exoPlaybackControlView == null) {
            return false;
        }
        exoPlaybackControlView.A01();
        return true;
    }

    public void setController(ExoPlaybackControlView exoPlaybackControlView) {
        Log.d("WAExoPlayerView/setController=");
        this.A02 = exoPlaybackControlView;
        if (exoPlaybackControlView != null) {
            if (1 != 0) {
                exoPlaybackControlView.A04 = this.A04;
            }
            AnonymousClass25O r0 = this.A01;
            if (r0 != null) {
                exoPlaybackControlView.setPlayer(r0);
            }
        }
    }

    public void setExoPlayerErrorActionsController(C669836s r1) {
        this.A03 = r1;
    }

    public void setLayoutResizingEnabled(boolean z) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.A09;
        int i = 3;
        if (z) {
            i = 0;
        }
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setPlayer(AnonymousClass25O r7) {
        SurfaceTexture surfaceTexture;
        SurfaceHolder holder;
        AnonymousClass25O r0 = this.A01;
        if (r0 != null) {
            r0.A0O.clear();
            this.A01.A0Q.clear();
            this.A01.AMe(this.A0B);
            AnonymousClass25O r02 = this.A01;
            r02.A03();
            r02.A01();
            r02.A06(null, false);
            r02.A05(0, 0);
        }
        this.A01 = r7;
        if (r7 != null) {
            if (this.A0C) {
                SurfaceView surfaceView = (SurfaceView) this.A08;
                if (surfaceView == null) {
                    holder = null;
                } else {
                    holder = surfaceView.getHolder();
                }
                r7.A03();
                r7.A01();
                r7.A05 = holder;
                if (holder == null) {
                    r7.A06(null, false);
                    r7.A05(0, 0);
                } else {
                    holder.addCallback(r7.A0H);
                    Surface surface = holder.getSurface();
                    if (surface == null || !surface.isValid()) {
                        r7.A06(null, false);
                        r7.A05(0, 0);
                    } else {
                        r7.A06(surface, false);
                        Rect surfaceFrame = holder.getSurfaceFrame();
                        r7.A05(surfaceFrame.width(), surfaceFrame.height());
                    }
                }
            } else {
                TextureView textureView = (TextureView) this.A08;
                r7.A03();
                r7.A01();
                r7.A06 = textureView;
                if (textureView == null) {
                    r7.A06(null, true);
                    r7.A05(0, 0);
                } else {
                    if (textureView.getSurfaceTextureListener() != null) {
                        android.util.Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
                    }
                    textureView.setSurfaceTextureListener(r7.A0H);
                    if (!textureView.isAvailable() || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
                        r7.A06(null, true);
                        r7.A05(0, 0);
                    } else {
                        r7.A06(new Surface(surfaceTexture), true);
                        r7.A05(textureView.getWidth(), textureView.getHeight());
                    }
                }
            }
            C72423Su r2 = this.A0B;
            CopyOnWriteArraySet copyOnWriteArraySet = r7.A0Q;
            copyOnWriteArraySet.clear();
            if (r2 != null) {
                copyOnWriteArraySet.add(r2);
            }
            r7.A1n(r2);
            CopyOnWriteArraySet copyOnWriteArraySet2 = r7.A0O;
            copyOnWriteArraySet2.clear();
            if (r2 != null) {
                if (!r7.A0C.isEmpty()) {
                    r2.AEn(r7.A0C);
                }
                copyOnWriteArraySet2.add(r2);
            }
            ExoPlaybackControlView exoPlaybackControlView = this.A02;
            if (exoPlaybackControlView != null) {
                exoPlaybackControlView.setPlayer(r7);
            }
        } else {
            this.A07.setVisibility(0);
        }
        this.A06 = false;
    }
}
