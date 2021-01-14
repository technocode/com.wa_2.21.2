package X;

import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0hC  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC11900hC extends AbstractC11910hD {
    public AbstractC11900hC(View view) {
        super(view);
    }

    public void A0C() {
        if (this instanceof C60542pf) {
            C60542pf r3 = (C60542pf) this;
            C59862oP r8 = null;
            if (r3.A01 == null) {
                ImageView imageView = r3.A06;
                imageView.setOnClickListener(null);
                r3.A05.setOnClickListener(null);
                imageView.setVisibility(8);
                r3.A04.setVisibility(0);
                return;
            }
            ViewOnClickCListenerShape13S0100000_I1_2 viewOnClickCListenerShape13S0100000_I1_2 = new ViewOnClickCListenerShape13S0100000_I1_2(r3, 6);
            if (r3.A07.A0D(AbstractC000400g.A2N)) {
                View$OnLongClickListenerC49312Pz r1 = new View$OnLongClickListenerC49312Pz(r3);
                r3.A06.setOnLongClickListener(r1);
                r3.A05.setOnLongClickListener(r1);
            }
            ImageView imageView2 = r3.A06;
            imageView2.setOnClickListener(viewOnClickCListenerShape13S0100000_I1_2);
            ViewGroup viewGroup = r3.A05;
            viewGroup.setOnClickListener(viewOnClickCListenerShape13S0100000_I1_2);
            viewGroup.setContentDescription(r3.A08.A06(R.string.gif_preview_description));
            r3.A04.setVisibility(8);
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(new ColorDrawable(13421772));
            if (r3.A0C == null) {
                AnonymousClass0Eg r2 = r3.A0A;
                r2.A01().A00(r3.A01.A03.A02, imageView2);
                return;
            }
            C49262Ps r12 = r3.A01;
            String str = r12.A02.A02;
            r3.A03 = str;
            if (str != null) {
                AnonymousClass0Eg r7 = r3.A0A;
                int i = r12.A00;
                AnonymousClass2f9 r4 = new AnonymousClass2f9(r3);
                if (r7 != null) {
                    AnonymousClass00E.A01();
                    AnonymousClass1VZ A06 = r7.A06.A06();
                    GifCacheItemSerializable A00 = A06.A00(str);
                    if (A00 == null || !new File(A00.filePath).exists() || A00.A00 == null) {
                        AnonymousClass00E.A01();
                        ThreadPoolExecutor threadPoolExecutor = r7.A01;
                        if (threadPoolExecutor == null) {
                            threadPoolExecutor = C006803i.A0P(4, 4, TimeUnit.SECONDS, "Gif cache Worker#");
                            r7.A01 = threadPoolExecutor;
                        }
                        r8 = new C59862oP(r7.A05, r7.A02, r7.A07, r7.A09, str, i, r7.A08, A06, r4);
                        ((AnonymousClass0JW) r8).A00.executeOnExecutor(threadPoolExecutor, new Void[0]);
                    } else {
                        r4.AG3(str, new File(A00.filePath), A00.A00);
                    }
                    r3.A02 = r8;
                    return;
                }
                throw null;
            }
        } else if (this instanceof TextureView$SurfaceTextureListenerC60532pe) {
            TextureView$SurfaceTextureListenerC60532pe r13 = (TextureView$SurfaceTextureListenerC60532pe) this;
            if (r13.A08) {
                r13.A09.setVisibility(0);
            }
        }
    }

    public void A0D() {
        MediaPlayer mediaPlayer;
        if (this instanceof C60542pf) {
            C60542pf r3 = (C60542pf) this;
            AnonymousClass0JW r0 = r3.A02;
            if (r0 != null) {
                r0.A00.cancel(false);
                r3.A02 = null;
            }
            AnonymousClass2Q2 r1 = r3.A0C;
            if (r1 != null) {
                C20250wO r02 = r1.A00;
                if (r02 != null) {
                    r02.stop();
                    r1.A00 = null;
                }
                C04900Mh r03 = r1.A01;
                if (r03 != null) {
                    r03.close();
                    r1.A01 = null;
                }
                r1.A03.setImageDrawable(null);
            }
            r3.A03 = null;
        } else if (this instanceof TextureView$SurfaceTextureListenerC60532pe) {
            TextureView$SurfaceTextureListenerC60532pe r2 = (TextureView$SurfaceTextureListenerC60532pe) this;
            r2.A09.setVisibility(8);
            if (r2.A07 && (mediaPlayer = r2.A01) != null) {
                mediaPlayer.pause();
                r2.A01.seekTo(0);
            }
        }
    }

    public void A0E(boolean z) {
        MediaPlayer mediaPlayer;
        if (this instanceof C73943Zl) {
            ((C73943Zl) this).A01.setShouldPlay(z);
        } else if (this instanceof TextureView$SurfaceTextureListenerC60532pe) {
            TextureView$SurfaceTextureListenerC60532pe r4 = (TextureView$SurfaceTextureListenerC60532pe) this;
            r4.A08 = z;
            if (!z) {
                if (r4.A07 && (mediaPlayer = r4.A01) != null) {
                    mediaPlayer.pause();
                }
            } else if (r4.A06) {
                TextureView textureView = r4.A09;
                textureView.setVisibility(0);
                textureView.setVisibility(0);
                MediaPlayer mediaPlayer2 = r4.A01;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                    r4.A07 = true;
                }
                r4.A07 = true;
            } else {
                r4.A0B.postDelayed(r4.A04, (long) r4.A00);
            }
        }
    }
}
