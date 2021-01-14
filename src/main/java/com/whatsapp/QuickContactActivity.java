package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01A;
import X.AnonymousClass01S;
import X.AnonymousClass01T;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass02X;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0HK;
import X.AnonymousClass0Q7;
import X.AnonymousClass1PN;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2UT;
import X.AnonymousClass31y;
import X.AnonymousClass35E;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C02770Dj;
import X.C02900Dx;
import X.C02920Dz;
import X.C09040cC;
import X.C09200cS;
import X.C14460mJ;
import X.C29901aO;
import X.C40471tK;
import X.ViewTreeObserver$OnPreDrawListenerC666235c;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.FloatingChildLayout;
import java.util.Map;

public class QuickContactActivity extends ActivityC004602e {
    public ImageView A00;
    public C007003k A01;
    public FloatingChildLayout A02;
    public boolean A03;
    public final C09040cC A04 = C09040cC.A00();
    public final AnonymousClass1PN A05 = AnonymousClass1PN.A00();
    public final AnonymousClass01A A06 = AnonymousClass01A.A00();
    public final AnonymousClass0BP A07 = new C40471tK(this);
    public final AnonymousClass08B A08 = AnonymousClass08B.A00;
    public final C014308b A09 = C014308b.A00();
    public final AnonymousClass0HK A0A = AnonymousClass0HK.A00();
    public final AnonymousClass01T A0B = AnonymousClass01T.A00();
    public final AnonymousClass01S A0C = AnonymousClass01S.A00();
    public final C02770Dj A0D = C02770Dj.A00();
    public final AnonymousClass31y A0E = AnonymousClass31y.A00();
    public final C09200cS A0F = C09200cS.A00();

    public static void A04(Activity activity, View view, AnonymousClass02N r11, String str) {
        C14460mJ r0;
        if (r11 != null) {
            Intent intent = new Intent(activity, QuickContactActivity.class);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            int i = iArr[0];
            rect.left = (int) ((((float) i) * 1.0f) + 0.5f);
            rect.top = (int) ((((float) iArr[1]) * 1.0f) + 0.5f);
            rect.right = (int) ((((float) (view.getWidth() + i)) * 1.0f) + 0.5f);
            rect.bottom = (int) ((((float) (view.getHeight() + iArr[1])) * 1.0f) + 0.5f);
            intent.setSourceBounds(rect);
            if (str != null) {
                intent.putExtra("transition_name", str);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                intent.putExtra("status_bar_color", activity.getWindow().getStatusBarColor());
            }
            intent.putExtra("jid", AnonymousClass1VY.A0D(r11));
            if (Build.VERSION.SDK_INT >= 23) {
                r0 = new C29901aO(ActivityOptions.makeBasic());
            } else {
                r0 = new C14460mJ();
            }
            activity.startActivity(intent, r0.A01());
            activity.overridePendingTransition(0, 0);
        }
    }

    public final void A0T() {
        Bitmap A022 = this.A0A.A02(this.A01, getResources().getDimensionPixelSize(R.dimen.quick_contact_profile_photo_size), 0.0f, false);
        if (A022 != null) {
            this.A00.setImageBitmap(A022);
        } else if (this.A01.A09()) {
            this.A00.setImageResource(R.drawable.avatar_group_large);
        } else {
            C007003k r1 = this.A01;
            if (AnonymousClass1VY.A0T(r1.A09)) {
                this.A00.setImageResource(R.drawable.avatar_broadcast_large);
            } else if (AnonymousClass1VY.A0a(r1.A09)) {
                this.A00.setImageResource(R.drawable.avatar_server_psa_large);
            } else {
                this.A00.setImageResource(R.drawable.avatar_contact_large);
            }
        }
    }

    public /* synthetic */ void A0U() {
        this.A02.invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getIntent().getIntExtra("status_bar_color", C004302a.A00(this, R.color.primary_dark)));
        }
        FloatingChildLayout floatingChildLayout = this.A02;
        floatingChildLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC666235c(floatingChildLayout, new RunnableEBaseShape6S0100000_I1_1(this, 23)));
    }

    public /* synthetic */ void A0V() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(0);
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public void A0W(Intent intent) {
        if (!this.A03) {
            C007003k r1 = this.A01;
            if (r1.A0R) {
                boolean z = true;
                if (r1.A09()) {
                    AnonymousClass01T r2 = this.A0B;
                    Jid A022 = this.A01.A02(AnonymousClass02U.class);
                    if (A022 == null) {
                        throw null;
                    } else if (!r2.A01((AnonymousClass02X) A022).A0A(r2.A01)) {
                        APo(R.string.failed_update_photo_not_authorized);
                        return;
                    }
                }
                Intent intent2 = new Intent(getApplicationContext(), ViewProfilePhoto.class);
                intent2.putExtra("jid", AnonymousClass1VY.A0D(this.A01.A09));
                if (!AnonymousClass2UT.A00) {
                    startActivity(intent2);
                    A0X(false);
                    return;
                }
                String stringExtra = getIntent().getStringExtra("transition_name");
                if (stringExtra == null) {
                    stringExtra = this.A05.A01(R.string.transition_photo);
                } else {
                    intent2.putExtra("circular_return_name", stringExtra);
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    intent2.putExtra("start_transition_alpha", 0.5f);
                } else {
                    z = false;
                }
                intent2.putExtra("start_transition_status_bar_color", getWindow().getStatusBarColor());
                intent2.putExtra("return_transition_status_bar_color", intent.getIntExtra("status_bar_color", C004302a.A00(this, R.color.primary_dark)));
                AnonymousClass0Q7.A0g(this.A00, stringExtra);
                startActivity(intent2, AnonymousClass2UT.A01(this, this.A00, stringExtra));
                if (z) {
                    A0X(false);
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableEBaseShape6S0100000_I1_1(this, 22), (long) getResources().getInteger(17694721));
                }
            }
        }
    }

    public final void A0X(boolean z) {
        if (z) {
            FloatingChildLayout floatingChildLayout = this.A02;
            if (floatingChildLayout.A01 == 1) {
                floatingChildLayout.A01 = 3;
                if (floatingChildLayout.A04.isRunning()) {
                    floatingChildLayout.A04.reverse();
                } else {
                    ValueAnimator ofInt = ValueAnimator.ofInt(127, 0);
                    floatingChildLayout.A04 = ofInt;
                    ofInt.addUpdateListener(new AnonymousClass35E(floatingChildLayout));
                    floatingChildLayout.A04.setDuration((long) floatingChildLayout.A00).start();
                }
            }
            FloatingChildLayout floatingChildLayout2 = this.A02;
            RunnableEBaseShape6S0100000_I1_1 runnableEBaseShape6S0100000_I1_1 = new RunnableEBaseShape6S0100000_I1_1(this, 26);
            int i = floatingChildLayout2.A03;
            if (i == 1 || i == 2) {
                floatingChildLayout2.A03 = 3;
                floatingChildLayout2.A07.invalidate();
                floatingChildLayout2.A01(true, runnableEBaseShape6S0100000_I1_1);
                return;
            }
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public void lambda$onCreate$1289$QuickContactActivity(View view) {
        C02920Dz r8;
        double doubleExtra = getIntent().getDoubleExtra("location_latitude", 0.0d);
        double doubleExtra2 = getIntent().getDoubleExtra("location_longitude", 0.0d);
        if (doubleExtra == 0.0d && doubleExtra2 == 0.0d) {
            AnonymousClass01S r9 = this.A0C;
            AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("gjid"));
            if (A012 != null) {
                Jid A022 = this.A01.A02(UserJid.class);
                if (A022 != null) {
                    synchronized (r9.A0R) {
                        Map map = (Map) r9.A0C().get(A012);
                        long A052 = r9.A0F.A05();
                        if (!(map == null || (r8 = (C02920Dz) map.get(A022)) == null)) {
                            long j = r8.A00;
                            if (j == 0 || j > A052) {
                                C02900Dx r0 = (C02900Dx) r9.A0c.get(r8.A01);
                                if (r0 != null) {
                                    doubleExtra = r0.A00;
                                    doubleExtra2 = r0.A01;
                                }
                            }
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        if (!(doubleExtra == 0.0d || doubleExtra2 == 0.0d)) {
            this.A0D.A07(this, doubleExtra, doubleExtra2, this.A09.A08(this.A01, false));
        }
        A0X(false);
    }

    public /* synthetic */ void lambda$onCreate$1292$QuickContactActivity(View view) {
        startActivity(Conversation.A04(this, this.A01));
        A0X(false);
    }

    public /* synthetic */ void lambda$onCreate$1293$QuickContactActivity(View view) {
        if (this.A0F.A06(this.A01, this, 7, true)) {
            A0X(false);
        }
    }

    public /* synthetic */ void lambda$onCreate$1294$QuickContactActivity(View view) {
        if (this.A0F.A01(this.A01, this, 7, true, true) == 0) {
            A0X(false);
        }
    }

    public void lambda$onCreate$1295$QuickContactActivity(View view) {
        if (this.A01.A09()) {
            GroupChatInfo.A05(this.A01, this, null);
        } else {
            C007003k r1 = this.A01;
            if (AnonymousClass1VY.A0T(r1.A09)) {
                ListChatInfo.A04(r1, this, null);
            } else {
                ContactInfoActivity.A07(r1, this, null);
            }
        }
        A0X(false);
    }

    public void lambda$onCreate$1296$QuickContactActivity(View view) {
        C09040cC r6 = this.A04;
        StringBuilder A0S = AnonymousClass008.A0S("smsto:");
        A0S.append(this.A01.A08.A01);
        r6.A01(this, Uri.parse(A0S.toString()), ((AnonymousClass2C0) this).A01.A0D(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/"), 16);
        A0X(false);
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        A0X(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x01b6  */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 512
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QuickContactActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A08.A00(this.A07);
    }
}
