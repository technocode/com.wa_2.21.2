package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.util.ViewOnClickCListenerShape1S0500000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.2IP  reason: invalid class name */
public class AnonymousClass2IP {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ProgressBar A06;
    public final C06180Sc A07 = C06180Sc.A00();
    public final ThumbnailButton A08;
    public final AnonymousClass2I5 A09;
    public final WebPagePreviewView A0A;
    public final C48032Kq A0B = C48032Kq.A00();
    public final C02580Cq A0C = C02580Cq.A01();

    public AnonymousClass2IP(Context context, AnonymousClass2I5 r4) {
        this.A00 = context;
        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context);
        this.A0A = webPagePreviewView;
        this.A06 = (ProgressBar) webPagePreviewView.findViewById(R.id.large_progress);
        this.A01 = this.A0A.findViewById(R.id.play_frame);
        this.A02 = this.A0A.findViewById(R.id.inline_indication);
        this.A05 = (ImageView) this.A0A.findViewById(R.id.logo_button);
        this.A04 = (ImageView) this.A0A.findViewById(R.id.large_thumb);
        this.A08 = (ThumbnailButton) this.A0A.findViewById(R.id.thumb);
        this.A03 = (FrameLayout) this.A0A.findViewById(R.id.large_thumb_frame);
        this.A09 = r4;
    }

    public final void A00(float f, float f2, float f3) {
        this.A06.setAlpha(f);
        this.A01.setAlpha(f2);
        this.A05.setAlpha(f2);
        this.A02.setAlpha(f3);
    }

    public void A01(AbstractC007503q r15, boolean z, AbstractC51572Zg r17, C64192xm r18) {
        ArrayList A8u;
        ArrayList A8u2;
        A02(r15, z, r17, r18);
        if (r15.A0s(1024)) {
            AnonymousClass2I5 r4 = this.A09;
            WebPagePreviewView webPagePreviewView = this.A0A;
            if (r17.getRowsContainer() == null) {
                A8u2 = null;
            } else {
                A8u2 = r17.getRowsContainer().A8u();
            }
            AnonymousClass2ZX r8 = new AnonymousClass2ZX(this, r15, z, r17, r18);
            if (r4 != null) {
                C05420Ol r2 = r15.A0H;
                if (r2 != null) {
                    C52162ag r6 = new C52162ag(r4.A02, r2);
                    r6.A01 = z;
                    webPagePreviewView.setTag(new AnonymousClass2I4(r15, r6));
                    webPagePreviewView.A01(r6, A8u2);
                    if (r2.A07 != null && r2.A00 == null) {
                        Set set = r4.A04;
                        String str = r15.A0n.A01;
                        if (!set.contains(str)) {
                            set.add(str);
                            r4.A03.ANH(new RunnableEBaseShape1S0500000_I1(r4, webPagePreviewView, r6, r15, r8, 1), str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        } else if (r15 instanceof C05490Ot) {
            WebPagePreviewView webPagePreviewView2 = this.A0A;
            C05490Ot r7 = (C05490Ot) r15;
            if (r17.getRowsContainer() == null) {
                A8u = null;
            } else {
                A8u = r17.getRowsContainer().A8u();
            }
            if (webPagePreviewView2 != null) {
                String str2 = r18.A01;
                String str3 = r18.A02;
                webPagePreviewView2.A02(r7, str2, str3, str3, A8u, z);
                return;
            }
            throw null;
        }
    }

    public final void A02(AbstractC007503q r16, boolean z, AbstractC51572Zg r18, C64192xm r19) {
        WebPagePreviewView webPagePreviewView;
        byte[] A0y;
        C007303n r1;
        Drawable A0N;
        Set A012 = this.A0B.A01(r16, r19.A02, r16.A08());
        if (A012 != null) {
            webPagePreviewView = this.A0A;
            webPagePreviewView.setLargeThumbFrameVisibility(false);
            ImageView imageView = ((AnonymousClass2I2) r18).A0E;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            webPagePreviewView.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(this, r19, A012, 9));
        } else if (Build.VERSION.SDK_INT < 19 || !z) {
            webPagePreviewView = this.A0A;
            webPagePreviewView.setLargeThumbFrameVisibility(false);
            this.A08.setVisibility(0);
            webPagePreviewView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r19, 23));
        } else {
            ProgressBar progressBar = this.A06;
            progressBar.animate().cancel();
            View view = this.A01;
            view.animate().cancel();
            View view2 = this.A02;
            view2.animate().cancel();
            progressBar.setAlpha(0.0f);
            view.setAlpha(1.0f);
            webPagePreviewView = this.A0A;
            webPagePreviewView.setLargeThumbFrameVisibility(true);
            this.A08.setVisibility(8);
            view2.setAlpha(0.0f);
            ImageView imageView2 = this.A05;
            imageView2.setAlpha(0.0f);
            int i = r19.A00;
            if (i == 1 || i == 7) {
                imageView2.setVisibility(8);
            } else {
                imageView2.animate().cancel();
                imageView2.setVisibility(0);
                imageView2.setImageResource(C670236x.A00(i));
                imageView2.setAlpha(1.0f);
            }
            C51812a4 r12 = new C51812a4(this, r16);
            Context context = this.A00;
            AnonymousClass377 r6 = ((Conversation) context).A1D;
            if (!(r6 == null || (r1 = r6.A09) == null || !r1.equals(r16.A0n))) {
                r6.A08 = r12;
                int i2 = r6.A01;
                if (i2 == 0) {
                    A00(1.0f, 0.0f, 0.0f);
                } else if (i2 == 1) {
                    A00(0.0f, 1.0f, 1.0f);
                } else if (i2 == 2) {
                    A00(0.0f, 1.0f, 0.0f);
                }
            }
            Bitmap[] bitmapArr = new Bitmap[1];
            webPagePreviewView.setOnClickListener(new ViewOnClickCListenerShape1S0500000_I1(this, r19, r16, r12, bitmapArr, 1));
            int A042 = (((AbstractC59162nB.A04(context) * 72) / 100) - webPagePreviewView.getPaddingLeft()) - webPagePreviewView.getPaddingRight();
            float f = 0.5625f;
            if (r19.A00 != 4) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C05420Ol r0 = r16.A0H;
                if (r0 != null) {
                    A0y = r0.A00;
                    if (A0y == null) {
                        A0y = r0.A09;
                    }
                } else {
                    A0y = r16 instanceof C05490Ot ? ((C05490Ot) r16).A0y() : new byte[0];
                }
                BitmapFactory.decodeByteArray(A0y, 0, A0y.length, options);
                float f2 = (float) (options.outWidth / options.outHeight);
                if (f2 < 1.0f) {
                    f = Math.max(f2, 0.5625f);
                } else {
                    f = Math.min(f2, 1.0f);
                }
            }
            this.A03.getLayoutParams().height = (int) (((float) A042) * f);
            C51802a3 r62 = new C51802a3(this, bitmapArr, A042);
            C05420Ol r02 = r16.A0H;
            if (r02 != null) {
                C02580Cq r7 = this.A0C;
                ImageView imageView3 = this.A04;
                if (r7 != null) {
                    imageView3.setTag(r02.A07);
                    synchronized (r7) {
                        if (C003701u.A0D()) {
                            r7.A07();
                        }
                        C05420Ol r03 = r16.A0H;
                        if (r03 != null) {
                            byte[] bArr = r03.A00;
                            String str = r03.A03;
                            if (bArr == null) {
                                bArr = r03.A09;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append("_micro");
                                str = sb.toString();
                            }
                            Bitmap A062 = r7.A06(str);
                            if (A062 == null) {
                                A062 = r7.A05(r16, true, false, bArr);
                                r7.A0F(str, A062);
                            }
                            r62.APh(imageView3, A062, r16);
                        }
                    }
                } else {
                    throw null;
                }
            } else if (r16 instanceof C05490Ot) {
                this.A0C.A0D(r16, this.A04, r62, false);
            }
        }
        FrameLayout frameLayout = (FrameLayout) webPagePreviewView.findViewById(R.id.link_preview_frame);
        if (r16.A0n.A02) {
            A0N = C28051Sr.A0O(this.A00);
        } else {
            A0N = C28051Sr.A0N(this.A00);
        }
        frameLayout.setForeground(A0N);
    }
}
