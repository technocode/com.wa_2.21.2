package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.Mp4Ops;
import com.whatsapp.conversation.ConversationVideoPictureInPictureActivity;
import com.whatsapp.util.Log;

/* renamed from: X.377  reason: invalid class name */
public class AnonymousClass377 {
    public int A00 = 0;
    public int A01 = 2;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public Bitmap A06;
    public FrameLayout A07;
    public C51812a4 A08;
    public C007303n A09;
    public AnonymousClass374 A0A;
    public AnonymousClass37M A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public final double A0G;
    public final Context A0H;
    public final Rect A0I = new Rect();
    public final AccessibilityManager A0J;
    public final C38521q1 A0K;
    public final C02780Dk A0L = C02780Dk.A02();
    public final AnonymousClass009 A0M = AnonymousClass009.A00();
    public final AnonymousClass02M A0N = AnonymousClass02M.A00();
    public final Mp4Ops A0O = Mp4Ops.A00();
    public final C000300f A0P = C000300f.A00();
    public final AnonymousClass03P A0Q = AnonymousClass03P.A00();
    public final AnonymousClass00G A0R = AnonymousClass00G.A01;
    public final AnonymousClass01X A0S = AnonymousClass01X.A00();
    public final C002701k A0T = C002701k.A00();
    public final AnonymousClass00Y A0U = AnonymousClass00Y.A00();
    public final AnonymousClass00T A0V = C002101e.A00();
    public final ScaleGestureDetector$OnScaleGestureListenerC669436n A0W;
    public final C670336y A0X = new C670336y(this.A0U);

    public AnonymousClass377(Context context, ScaleGestureDetector$OnScaleGestureListenerC669436n r6, C38521q1 r7, AccessibilityManager accessibilityManager) {
        int height;
        this.A0H = context;
        this.A0W = r6;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.inline_video_player_padding);
        if (context.getResources().getConfiguration().orientation == 1) {
            height = r6.getWidth();
        } else {
            height = r6.getHeight();
        }
        int i = height - (dimensionPixelSize << 1);
        this.A0G = (double) (((i * i) * 9) >> 4);
        this.A0K = r7;
        ScaleGestureDetector$OnScaleGestureListenerC669436n r3 = this.A0W;
        int[] viewIdsToIgnoreScaling = AnonymousClass374.getViewIdsToIgnoreScaling();
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.inline_controls_padding);
        r3.A0N = viewIdsToIgnoreScaling;
        r3.A06 = dimensionPixelSize2;
        this.A0J = accessibilityManager;
    }

    public void A00() {
        long j;
        C007303n r0;
        long j2;
        int i;
        if (this.A0E) {
            Log.i("InlineVideoPlaybackHandler/closeInlineFrame");
            C670336y r7 = this.A0X;
            int i2 = this.A04;
            AnonymousClass37M r02 = this.A0B;
            long j3 = 0;
            if (r02 != null) {
                j = (long) r02.A02();
            } else {
                j = 0;
            }
            C63922xE r12 = r7.A06;
            if (r12.A02) {
                r12.A00();
            }
            C63922xE r15 = r7.A04;
            r15.A00();
            AnonymousClass20L r6 = new AnonymousClass20L();
            if (!r7.A00) {
                boolean z = r7.A01;
                if (z) {
                    j2 = 0;
                } else {
                    j2 = r15.A00;
                }
                r6.A02 = Long.valueOf(j2);
                r6.A03 = Long.valueOf(Math.round(((double) j) / 10000.0d) * 10000);
                if (z) {
                    j3 = r7.A05.A00;
                }
                r6.A04 = Long.valueOf(j3);
                r6.A00 = Boolean.valueOf(z);
                r6.A05 = Long.valueOf(r7.A03.A00);
                r6.A06 = Long.valueOf(Math.round(((double) r12.A00) / 10000.0d) * 10000);
                switch (i2) {
                    case 1:
                        i = 5;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 6;
                        break;
                    case 8:
                        i = 8;
                        break;
                    default:
                        i = null;
                        break;
                }
                r6.A01 = i;
                r7.A02.A0B(r6, null, false);
            }
            r7.A00 = false;
            r7.A01 = false;
            r7.A05.A01();
            r15.A01();
            r12.A01();
            r7.A03.A01();
            this.A01 = 2;
            C51812a4 r1 = this.A08;
            if (!(r1 == null || (r0 = this.A09) == null)) {
                r1.A01(r0, 2);
                this.A08 = null;
            }
            AnonymousClass374 r03 = this.A0A;
            if (r03 != null) {
                r03.A06();
            }
            AnonymousClass37M r04 = this.A0B;
            if (r04 != null) {
                r04.A08();
                this.A0B = null;
            }
            ScaleGestureDetector$OnScaleGestureListenerC669436n r05 = this.A0W;
            r05.setSystemUiVisibility(0);
            r05.A0M = false;
            r05.A0K = false;
            r05.A0I = true;
            r05.A09 = 0;
            r05.A0A = 0;
            r05.removeAllViews();
            this.A0E = false;
            this.A0F = false;
            this.A09 = null;
            this.A0C = null;
        }
    }

    public void A01() {
        this.A07.setContentDescription(this.A0S.A06(R.string.inline_video_fullscreen));
        ScaleGestureDetector$OnScaleGestureListenerC669436n r4 = this.A0W;
        r4.A0I = false;
        r4.A0M = false;
        r4.A0K = true;
        r4.A0J = false;
        r4.A0A(1.0f);
        FrameLayout frameLayout = this.A07;
        if (!(frameLayout.getX() == 0.0f || frameLayout.getY() == 0.0f)) {
            r4.A09 = r4.A02(r4.A03);
            r4.A0A = r4.A03(r4.A02);
        }
        AnonymousClass0Q7.A0M(C02780Dk.A00(this.A0H).getWindow().getDecorView());
        this.A07.setScaleX(1.0f);
        this.A07.setScaleY(1.0f);
        Conversation conversation = this.A0K.A00;
        if (C06170Sb.A01(conversation.A0E)) {
            conversation.A0k.A00();
        } else {
            conversation.A1K();
        }
        FrameLayout frameLayout2 = this.A07;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Point point = new Point();
        Point point2 = new Point();
        frameLayout2.getGlobalVisibleRect(rect, point2);
        r4.getGlobalVisibleRect(rect2, point);
        rect.offset(point2.x - rect.left, point2.y - rect.top);
        rect2.offset(-point.x, -point.y);
        this.A0I.set(rect);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        A0A(frameLayout2, rect, rect2);
        this.A0F = true;
        AnonymousClass374 r2 = this.A0A;
        if (r2.A05 != null) {
            r2.A0H.setVisibility(0);
        }
        r2.A0Q.setVisibility(8);
        r2.A09 = true;
        r2.A07();
        r4.requestLayout();
        A06();
    }

    public void A02() {
        if (this.A0A.A0G.getVisibility() == 0) {
            this.A0A.A00();
        } else {
            this.A0A.A05();
        }
    }

    public void A03() {
        AnonymousClass37M r0 = this.A0B;
        if (r0 != null && r0.A0B()) {
            this.A0A.A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0049, code lost:
        if (r0.A0B() == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r5 = this;
            android.content.Context r4 = r5.A0H
            java.lang.Class<com.whatsapp.conversation.ConversationVideoPictureInPictureActivity> r0 = com.whatsapp.conversation.ConversationVideoPictureInPictureActivity.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4, r0)
            java.lang.String r1 = r5.A0D
            java.lang.String r0 = "video_url"
            r3.putExtra(r0, r1)
            int r1 = r5.A04
            java.lang.String r0 = "video_type"
            r3.putExtra(r0, r1)
            X.37M r0 = r5.A0B
            r2 = 0
            if (r0 == 0) goto L_0x0061
            int r1 = r0.A01()
        L_0x0022:
            java.lang.String r0 = "video_seek_position"
            r3.putExtra(r0, r1)
            android.graphics.Bitmap r1 = r5.A06
            java.lang.String r0 = "video_thumbnail"
            r3.putExtra(r0, r1)
            int r1 = r5.A05
            java.lang.String r0 = "video_width"
            r3.putExtra(r0, r1)
            int r1 = r5.A03
            java.lang.String r0 = "video_height"
            r3.putExtra(r0, r1)
            X.37M r0 = r5.A0B
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.A0B()
            r1 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            java.lang.String r0 = "is_video_playing"
            r3.putExtra(r0, r1)
            X.0Dk r0 = r5.A0L
            r0.A05(r4, r3)
            android.app.Activity r0 = X.C02780Dk.A00(r4)
            r0.overridePendingTransition(r2, r2)
            r5.A00()
            return
        L_0x0061:
            r1 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass377.A04():void");
    }

    public final void A05() {
        String str = this.A0C;
        if (str != null) {
            this.A0L.ANL(this.A0H, Uri.parse(str));
        }
        this.A0X.A00 = true;
        A00();
    }

    public final void A06() {
        FrameLayout frameLayout = this.A07;
        if (frameLayout instanceof AnonymousClass376) {
            ((AnonymousClass376) frameLayout).A00.A00 = !this.A0F;
        }
    }

    public final void A07() {
        if (this.A0F) {
            A0E(false);
        } else {
            A01();
        }
    }

    public void A08(int i) {
        this.A00 = i;
    }

    public void A09(int i) {
        this.A02 = i;
    }

    public final void A0A(View view, Rect rect, Rect rect2) {
        float width;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        if (!this.A0F) {
            if (((float) rect2.width()) / ((float) rect2.height()) > ((float) rect.width()) / ((float) rect.height())) {
                width = ((float) rect.height()) / ((float) rect2.height());
                float width2 = ((((float) rect2.width()) * width) - ((float) rect.width())) / 2.0f;
                rect.left = (int) (((float) rect.left) - width2);
                rect.right = (int) (((float) rect.right) + width2);
            } else {
                width = ((float) rect.width()) / ((float) rect2.width());
                float height = ((((float) rect2.height()) * width) - ((float) rect.height())) / 2.0f;
                rect.top = (int) (((float) rect.top) - height);
                rect.bottom = (int) (((float) rect.bottom) + height);
            }
        } else if (((float) rect2.width()) / ((float) rect2.height()) < ((float) rect.width()) / ((float) rect.height())) {
            width = ((float) rect.height()) / ((float) rect2.height());
            float width3 = ((((float) rect2.width()) * width) - ((float) rect.width())) / 2.0f;
            rect.left = (int) (((float) rect.left) - width3);
            rect.right = (int) (((float) rect.right) + width3);
        } else {
            width = ((float) rect.width()) / ((float) rect2.width());
            float height2 = ((((float) rect2.height()) * width) - ((float) rect.height())) / 2.0f;
            rect.top = (int) (((float) rect.top) - height2);
            rect.bottom = (int) (((float) rect.bottom) + height2);
        }
        float f = 1.0f;
        if (this.A0F) {
            f = this.A0W.A00;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(view, View.X, (float) rect.left, (float) rect2.left)).with(ObjectAnimator.ofFloat(view, View.Y, (float) rect.top, (float) rect2.top)).with(ObjectAnimator.ofFloat(view, View.SCALE_X, width, f)).with(ObjectAnimator.ofFloat(view, View.SCALE_Y, width, f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    public final void A0B(C670236x r22, C007303n r23, int i, Bitmap[] bitmapArr) {
        double d;
        Context context;
        FrameLayout r3;
        FrameLayout frameLayout;
        AnonymousClass37M r12;
        Bitmap bitmap;
        int i2;
        if (this.A0B != null || r23 != this.A09) {
            Log.d("InlineVideoPlaybackHandler startInlinePlayback squashed, incorrect rowKey");
        } else if (r22 == null) {
            Log.i("InlineVideoPlaybackHandler/startInlinePlayback - loadPage returned null.  Opening video externally");
            String str = this.A0C;
            if (str != null) {
                C27261Ou.A00.remove(str);
            }
            A05();
        } else {
            C670336y r7 = this.A0X;
            r7.A04.A02();
            r7.A05.A02();
            C51812a4 r0 = this.A08;
            if (r0 != null) {
                r0.A01(r23, 1);
                this.A01 = 1;
            }
            this.A04 = i;
            this.A06 = bitmapArr[0];
            String str2 = r22.A02;
            this.A0D = str2;
            int i3 = r22.A00;
            if (i3 == -1 || (i2 = r22.A01) == -1) {
                d = 1.7777777777777777d;
            } else {
                d = ((double) i2) / ((double) i3);
            }
            int sqrt = (int) Math.sqrt(this.A0G / d);
            this.A03 = sqrt;
            this.A05 = (int) (((double) sqrt) * d);
            if (Build.VERSION.SDK_INT < 21) {
                context = this.A0H;
                r3 = new FrameLayout(context);
            } else {
                context = this.A0H;
                r3 = new AnonymousClass376(context);
            }
            this.A07 = r3;
            A06();
            AnonymousClass01X r02 = this.A0S;
            r3.setContentDescription(r02.A06(R.string.inline_video_pip));
            this.A07.setFocusable(true);
            this.A07.setImportantForAccessibility(1);
            this.A07.setFocusableInTouchMode(true);
            ScaleGestureDetector$OnScaleGestureListenerC669436n r1 = this.A0W;
            r1.A0F = new C72253Sd(this);
            this.A0E = true;
            AnonymousClass0Q7.A0Q(this.A07, 6.0f);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.A07.addView(frameLayout2);
            AnonymousClass374 r10 = new AnonymousClass374(context, r7);
            this.A0A = r10;
            if (bitmapArr[0] != null) {
                ((ImageView) r10.findViewById(R.id.background)).setImageBitmap(bitmapArr[0]);
            }
            this.A0A.setCloseBtnListener(new C72323Sk(this));
            AnonymousClass374 r11 = this.A0A;
            r11.A02 = new C72273Sf(this);
            if (i == 1 || i == 7) {
                r11.A0O.setVisibility(8);
            } else {
                r11.A0O.setImageResource(C670236x.A00(i));
                ImageButton imageButton = r11.A0O;
                imageButton.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r11, 17));
                imageButton.setVisibility(0);
            }
            this.A0A.setFullscreenButtonClickListener(new C72333Sl(this));
            frameLayout2.addView(this.A0A);
            this.A07.setOnHoverListener(new View$OnHoverListenerC668236b(this));
            this.A07.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 20));
            FrameLayout frameLayout3 = this.A07;
            C51812a4 r72 = this.A08;
            if (r23.equals(r72.A01.A0n)) {
                frameLayout = r72.A00.A03;
            } else {
                frameLayout = null;
            }
            int i4 = this.A05;
            int i5 = this.A03;
            if (r1.A0L) {
                r1.A04 = r1.A07;
                r1.A05 = r1.A08;
                r1.A0L = false;
            }
            r1.A00 = 1.0f;
            r1.A03 = i4;
            r1.A02 = i5;
            r1.A04 = r1.A02(i4);
            r1.A05 = r1.A03(i5);
            if (frameLayout == null) {
                frameLayout3.setScaleX(0.0f);
                frameLayout3.setScaleY(0.0f);
                frameLayout3.setAlpha(0.0f);
            } else {
                int[] iArr = new int[2];
                frameLayout.getLocationInWindow(iArr);
                frameLayout3.setTranslationX((float) (iArr[0] - r1.A04));
                frameLayout3.setTranslationY((float) (iArr[1] - r1.A05));
                frameLayout3.setPivotY(0.0f);
                frameLayout3.setPivotX(0.0f);
                frameLayout3.setScaleX(((float) frameLayout.getWidth()) / ((float) i4));
                frameLayout3.setScaleY(((float) frameLayout.getHeight()) / ((float) i5));
            }
            r1.A0H = true;
            r1.addView(frameLayout3, i4, i5);
            if (i == 4) {
                Bitmap bitmap2 = this.A06;
                if (bitmap2 != null) {
                    bitmap = Bitmap.createScaledBitmap(bitmap2, this.A05, this.A03, false);
                } else {
                    bitmap = null;
                }
                r12 = new C72463Sy(context, this.A0N, str2, this.A0A, bitmap);
                this.A0B = r12;
            } else {
                r12 = new C72403Ss(this.A0N, this.A0V, this.A0Q, r02, C02780Dk.A00(context), Uri.parse(str2), new C74303ab(this.A0R, this.A0O, this.A0M, AnonymousClass0W2.A05(context, C001801b.A0V(context))), null);
                this.A0B = r12;
            }
            frameLayout2.addView(r12.A04(), 0);
            this.A0B.A04().setBackgroundColor(context.getResources().getColor(R.color.black));
            AnonymousClass37M r4 = this.A0B;
            r4.A02 = new AnonymousClass3SU(this);
            r4.A03 = new C74293aa(this, r23);
            this.A0A.setPlayer(r4);
            this.A0A.A0P.setVisibility(4);
            r1.setControlView(this.A0A);
            this.A0B.A07();
            if (Build.VERSION.SDK_INT >= 26 && C002001d.A3N(this.A0P, this.A0Q)) {
                context.sendBroadcast(ConversationVideoPictureInPictureActivity.A00());
            }
        }
    }

    public void A0C(String str, C007303n r8, C51812a4 r9, int i, Bitmap[] bitmapArr) {
        if (this.A09 != r8) {
            StringBuilder sb = new StringBuilder("InlineVideoPlaybackHandler/fetchPageInfo rowKey=");
            sb.append(r8);
            sb.append(" url=");
            sb.append(str);
            Log.i(sb.toString());
            A00();
            this.A09 = r8;
            this.A0C = str;
            this.A08 = r9;
            if (i == 4) {
                A0B(new C670236x(str, -1, -1), r8, i, bitmapArr);
                return;
            }
            String obj = Uri.parse(str).buildUpon().appendQueryParameter("wa_logging_event", "video_play_open").build().toString();
            C27241Os A002 = C27261Ou.A00(obj);
            if (A002 != null) {
                A0B(A002.A08, r8, i, bitmapArr);
                return;
            }
            this.A08.A01(r8, 0);
            this.A01 = 0;
            try {
                C27261Ou.A01(this.A0T, this.A0N, this.A0V, this.A0S, obj, new C74283aZ(this, r8, i, bitmapArr));
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder("InlineVideoPlaybackHandler/onPlaybackError=");
                sb2.append("InlineVideoPlaybackHandler/fetchPageInfo - loadPage failed");
                sb2.append(" isTransient=");
                sb2.append(true);
                Log.e(sb2.toString());
                A05();
            }
        }
    }

    public final void A0D(String str, boolean z) {
        StringBuilder sb = new StringBuilder("InlineVideoPlaybackHandler/onPlaybackError=");
        sb.append(str);
        sb.append(" isTransient=");
        sb.append(z);
        Log.e(sb.toString());
        A05();
    }

    public void A0E(boolean z) {
        this.A07.setContentDescription(this.A0S.A06(R.string.inline_video_pip));
        ScaleGestureDetector$OnScaleGestureListenerC669436n r6 = this.A0W;
        boolean z2 = true;
        r6.A0I = true;
        r6.A0M = false;
        r6.A0A(r6.A00);
        if (z || this.A02 != this.A00) {
            this.A07.setLayoutParams(new FrameLayout.LayoutParams(this.A05, this.A03));
        } else {
            FrameLayout frameLayout = this.A07;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Point point = new Point();
            r6.getGlobalVisibleRect(rect, point);
            rect.offset(-point.x, -point.y);
            rect2.set(this.A0I);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(this.A05, this.A03));
            A0A(frameLayout, rect, rect2);
        }
        this.A0F = false;
        AnonymousClass374 r2 = this.A0A;
        r2.A0H.setVisibility(8);
        r2.A0Q.setVisibility(0);
        r2.A09 = false;
        r2.A07();
        this.A0A.setSystemUiVisibility(0);
        r6.A0J = true;
        if (this.A02 != this.A00) {
            z2 = false;
        }
        r6.A0B(z2);
        r6.A0K = false;
        AnonymousClass0Q7.A0M(C02780Dk.A00(this.A0H).getWindow().getDecorView());
        this.A02 = this.A00;
        A06();
    }

    public /* synthetic */ void A0F(boolean z) {
        if (z) {
            A0E(true);
        } else {
            A00();
        }
    }

    public boolean A0G() {
        return this.A0E;
    }

    public boolean A0H() {
        return this.A0F;
    }

    public /* synthetic */ boolean A0I(MotionEvent motionEvent) {
        if (!C002001d.A3H(this.A0J) || motionEvent.getActionMasked() != 10) {
            return false;
        }
        this.A07.requestFocus();
        this.A07.performClick();
        return true;
    }
}
