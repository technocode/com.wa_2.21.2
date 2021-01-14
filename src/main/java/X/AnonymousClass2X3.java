package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import java.util.HashSet;

/* renamed from: X.2X3  reason: invalid class name */
public class AnonymousClass2X3 implements AnonymousClass0D9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ChatInfoActivity A01;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
    }

    public AnonymousClass2X3(ChatInfoActivity chatInfoActivity, int i) {
        this.A01 = chatInfoActivity;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return (int) (((float) this.A00) * C002301g.A0K.A00);
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r9) {
        C60662pu r3 = (C60662pu) view;
        if (bitmap == null) {
            r3.A01 = 0;
            byte b = r9.A0m;
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 9) {
                            if (b != 13) {
                                if (!(b == 23 || b == 25)) {
                                    if (b != 26) {
                                        if (!(b == 28 || b == 29)) {
                                            r3.setImageResource(0);
                                        }
                                    }
                                }
                            }
                        }
                        r3.setImageDrawable(AnonymousClass0ZD.A03(view.getContext(), (AnonymousClass0M2) r9));
                    }
                    r3.setImageResource(R.drawable.media_video);
                } else {
                    r3.setImageDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(C004302a.A00(view.getContext(), R.color.music_scrubber)), new InsetDrawable(C004302a.A03(view.getContext(), R.drawable.gallery_audio_item), view.getResources().getDimensionPixelSize(R.dimen.thumbnail_padding))}));
                }
            }
            r3.setImageResource(R.drawable.media_image);
        } else {
            r3.setImageBitmap(bitmap);
        }
        HashSet hashSet = this.A01.A0I;
        C007303n r1 = r9.A0n;
        if (!hashSet.contains(r1)) {
            hashSet.add(r1);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            view.startAnimation(alphaAnimation);
        }
    }
}
