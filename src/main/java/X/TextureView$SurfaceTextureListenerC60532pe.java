package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2pe  reason: invalid class name and case insensitive filesystem */
public class TextureView$SurfaceTextureListenerC60532pe extends AbstractC59872oQ implements TextureView.SurfaceTextureListener {
    public int A00 = 500;
    public MediaPlayer A01;
    public Surface A02;
    public C49232Po A03;
    public Runnable A04 = new RunnableEBaseShape10S0100000_I1_5(this, 1);
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final TextureView A09;
    public final View A0A;
    public final ImageView A0B;
    public final AnonymousClass0Eg A0C;

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureView$SurfaceTextureListenerC60532pe(ViewGroup viewGroup, AnonymousClass0Eg r4, int i) {
        super(viewGroup);
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.A0C = r4;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        this.A0B = (ImageView) view.findViewById(R.id.thumb_view);
        this.A09 = (TextureView) view.findViewById(R.id.gif_surface_view);
        this.A0A = view.findViewById(R.id.loading_progress);
        this.A09.setSurfaceTextureListener(this);
        this.A09.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r8 < r2) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r3 > r6) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r1 = (r3 / r6) / (r4 / r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureView$SurfaceTextureListenerC60532pe.A0F():void");
    }

    public void A0G(C49232Po r7) {
        if ((this.A03 != r7 || this.A01 == null) && r7 != null) {
            this.A03 = r7;
            ImageView imageView = this.A0B;
            imageView.setVisibility(0);
            this.A0A.setVisibility(8);
            imageView.setImageDrawable(null);
            AnonymousClass0Eg r1 = this.A0C;
            C54322ej r3 = new C54322ej(imageView);
            if (r1 != null) {
                AnonymousClass00E.A01();
                r1.A0B.ANC(new C10430ec(r7, r1.A06.A06(), r3), new Void[0]);
                synchronized (this) {
                    if (this.A03 != null) {
                        MediaPlayer mediaPlayer = this.A01;
                        if (mediaPlayer == null) {
                            this.A01 = new MediaPlayer();
                        } else {
                            mediaPlayer.reset();
                        }
                        this.A01.setLooping(true);
                        this.A06 = false;
                        this.A05 = false;
                        try {
                            this.A01.setDataSource(this.A09.getContext(), Uri.parse(this.A03.A03));
                            this.A01.setOnPreparedListener(new C49302Py(this));
                            this.A05 = true;
                            imageView.postDelayed(this.A04, (long) this.A00);
                        } catch (IOException e) {
                            Log.e("GifMessagePreviewHolder/prepareGif failed to prepare mediaplayer", e);
                        }
                        return;
                    }
                    return;
                }
            }
            throw null;
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A02 = new Surface(surfaceTexture);
        A0F();
        MediaPlayer mediaPlayer = this.A01;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(this.A02);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MediaPlayer mediaPlayer = this.A01;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(null);
            A0D();
        }
        Surface surface = this.A02;
        if (surface != null) {
            surface.release();
            this.A02 = null;
            return true;
        }
        throw null;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        A0F();
    }
}
