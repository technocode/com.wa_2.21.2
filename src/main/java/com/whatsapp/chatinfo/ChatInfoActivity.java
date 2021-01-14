package com.whatsapp.chatinfo;

import X.AbstractC59162nB;
import X.ActivityC03630Ha;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass03S;
import X.AnonymousClass0AS;
import X.AnonymousClass0HL;
import X.AnonymousClass0JW;
import X.AnonymousClass0M3;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1PK;
import X.AnonymousClass1PN;
import X.AnonymousClass1VY;
import X.AnonymousClass1YA;
import X.AnonymousClass2UQ;
import X.AnonymousClass2UT;
import X.AnonymousClass2X1;
import X.AnonymousClass2X2;
import X.AnonymousClass2X6;
import X.AsyncTaskC15820ol;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C006803i;
import X.C006903j;
import X.C007003k;
import X.C007303n;
import X.C01970Ad;
import X.C02040Ak;
import X.C02580Cq;
import X.C02590Cr;
import X.C02780Dk;
import X.C15830om;
import X.C15860op;
import X.C15870oq;
import X.C15880or;
import X.C27831Rq;
import X.C28051Sr;
import X.C58772mV;
import X.C58782mW;
import X.C60002od;
import X.DialogInterface$OnClickListenerC46592Eb;
import X.DialogInterface$OnClickListenerC46602Ec;
import X.DialogInterface$OnClickListenerC46612Ed;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.ui.media.MediaCard;
import java.util.HashSet;

public abstract class ChatInfoActivity extends ActivityC03630Ha {
    public int A00;
    public int A01;
    public AnonymousClass2X6 A02;
    public AnonymousClass0M3 A03;
    public boolean A04;
    public final AnonymousClass01I A05 = AnonymousClass01I.A00();
    public final AnonymousClass1PN A06 = AnonymousClass1PN.A00();
    public final C27831Rq A07 = C27831Rq.A00();
    public final AnonymousClass0HL A08 = AnonymousClass0HL.A00();
    public final AnonymousClass03S A09 = AnonymousClass03S.A00();
    public final AnonymousClass01X A0A = AnonymousClass01X.A00();
    public final C006903j A0B = C006903j.A00();
    public final AnonymousClass01K A0C = AnonymousClass01K.A00();
    public final AnonymousClass0AS A0D = AnonymousClass0AS.A00();
    public final C02040Ak A0E = C02040Ak.A00();
    public final C01970Ad A0F = C01970Ad.A00();
    public final C02580Cq A0G = C02580Cq.A01();
    public final AnonymousClass00T A0H = C002101e.A00();
    public final HashSet A0I = new HashSet();

    public class EncryptionExplanationDialogFragment extends WaDialogFragment {
        public final C02780Dk A00 = C02780Dk.A02();
        public final AnonymousClass01A A01 = AnonymousClass01A.A00();
        public final AnonymousClass01X A02 = AnonymousClass01X.A00();
        public final C02590Cr A03 = C02590Cr.A00();
        public final AnonymousClass0M9 A04 = AnonymousClass0M9.A01();

        public static EncryptionExplanationDialogFragment A00(AnonymousClass02N r4, int i, String str) {
            EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = new EncryptionExplanationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", r4.getRawString());
            bundle.putInt("provider_category", i);
            bundle.putString("display_name", str);
            encryptionExplanationDialogFragment.A0N(bundle);
            return encryptionExplanationDialogFragment;
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r3;
            String A06;
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                String string = bundle2.getString("jid");
                int i = bundle2.getInt("provider_category", 0);
                String string2 = bundle2.getString("display_name");
                AnonymousClass01A r1 = this.A01;
                AnonymousClass02N A012 = AnonymousClass02N.A01(string);
                AnonymousClass00E.A04(A012, string);
                C007003k A0A = r1.A0A(A012);
                if (i == 1 || i == 5) {
                    r3 = this.A02;
                    A06 = r3.A06(AnonymousClass1YA.A01(i, A0A.A09));
                } else {
                    r3 = this.A02;
                    int A013 = AnonymousClass1YA.A01(i, A0A.A09);
                    Object[] objArr = new Object[2];
                    if (string2 != null) {
                        objArr[0] = string2;
                        objArr[1] = string2;
                        A06 = r3.A0D(A013, objArr);
                    } else {
                        throw null;
                    }
                }
                AnonymousClass0MB r6 = new AnonymousClass0MB(A0A());
                CharSequence A1J = C002001d.A1J(A06, A0A(), this.A03);
                AnonymousClass0MC r0 = r6.A01;
                r0.A0E = A1J;
                r0.A0J = true;
                r6.A05(r3.A06(R.string.ok), new DialogInterface$OnClickListenerC46602Ec(this));
                r6.A06(r3.A06(R.string.learn_more), new DialogInterface$OnClickListenerC46592Eb(this, i));
                if (!A0A.A09() && !AnonymousClass1VY.A0T(A0A.A09) && i == 1) {
                    r6.A07(r3.A06(R.string.identity_change_verify), new DialogInterface$OnClickListenerC46612Ed(this, A0A));
                }
                return r6.A00();
            }
            throw null;
        }
    }

    public AnonymousClass02N A0V() {
        if (this instanceof GroupChatInfo) {
            return ((GroupChatInfo) this).A0g();
        }
        if (!(this instanceof ListChatInfo)) {
            return ((ContactInfoActivity) this).A0h();
        }
        return ((ListChatInfo) this).A0g();
    }

    public void A0W() {
        if (this instanceof GroupChatInfo) {
            GroupChatInfo groupChatInfo = (GroupChatInfo) this;
            groupChatInfo.A0Y();
            C60002od r0 = groupChatInfo.A0N;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
                groupChatInfo.A0N = null;
            }
            AnonymousClass0JW r02 = groupChatInfo.A0W;
            if (r02 != null) {
                r02.A00.cancel(true);
                groupChatInfo.A0N = null;
            }
        } else if (this instanceof ListChatInfo) {
            ListChatInfo listChatInfo = (ListChatInfo) this;
            listChatInfo.A0Y();
            C58782mW r03 = listChatInfo.A07;
            if (r03 != null) {
                ((AnonymousClass0JW) r03).A00.cancel(true);
                listChatInfo.A07 = null;
            }
        } else if (!(this instanceof ContactInfoActivity)) {
            A0Y();
        } else {
            ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this;
            contactInfoActivity.A0Y();
            C58772mV r04 = contactInfoActivity.A0E;
            if (r04 != null) {
                ((AnonymousClass0JW) r04).A00.cancel(true);
                contactInfoActivity.A0E = null;
            }
        }
    }

    public void A0X() {
        A0Y();
        MediaCard mediaCard = (MediaCard) findViewById(R.id.media_card_view);
        AnonymousClass02N A0V = A0V();
        if (A0V != null) {
            AnonymousClass2X6 r2 = new AnonymousClass2X6(mediaCard, A0V);
            this.A02 = r2;
            this.A0H.ANC(r2, new Void[0]);
            return;
        }
        throw null;
    }

    public void A0Y() {
        AnonymousClass2X6 r0 = this.A02;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A02 = null;
        }
    }

    public void A0Z(int i, int i2) {
        float abs;
        ChatInfoLayout chatInfoLayout = (ChatInfoLayout) findViewById(R.id.content);
        chatInfoLayout.findViewById(R.id.photo_progress).setVisibility(8);
        ((ImageView) chatInfoLayout.findViewById(R.id.picture)).setImageResource(i);
        int A002 = C004302a.A00(this, i2);
        this.A00 = A002;
        chatInfoLayout.setColor(A002);
        findViewById(R.id.bottom_shade).setBackgroundColor(0);
        findViewById(R.id.top_shade).setBackgroundColor(0);
        if (Build.VERSION.SDK_INT >= 21) {
            float[] fArr = new float[3];
            int i3 = this.A00;
            float red = ((float) Color.red(i3)) / 255.0f;
            float green = ((float) Color.green(i3)) / 255.0f;
            float blue = ((float) Color.blue(i3)) / 255.0f;
            float max = Math.max(red, Math.max(green, blue));
            float min = Math.min(red, Math.min(green, blue));
            float f = max - min;
            float f2 = (max + min) / 2.0f;
            float f3 = 0.0f;
            if (max == min) {
                abs = 0.0f;
            } else {
                if (max == red) {
                    f3 = ((green - blue) / f) % 6.0f;
                } else {
                    f3 = max == green ? ((blue - red) / f) + 2.0f : ((red - green) / f) + 4.0f;
                }
                abs = f / (1.0f - Math.abs((2.0f * f2) - 1.0f));
            }
            fArr[0] = (f3 * 60.0f) % 360.0f;
            fArr[1] = abs;
            fArr[2] = f2;
            fArr[2] = (f2 * 8.0f) / 10.0f;
            this.A01 = C28051Sr.A0G(fArr);
            getWindow().setStatusBarColor(this.A01);
        }
    }

    public void A0a(long j) {
        View findViewById = findViewById(R.id.payment_transactions_layout);
        View findViewById2 = findViewById(R.id.payment_transactions_separator);
        if (j == 0) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        findViewById2.setVisibility(0);
        ((TextView) findViewById(R.id.payment_transactions_count)).setText(this.A0A.A0G().format(j));
    }

    public void A0b(long j) {
        View findViewById = findViewById(R.id.starred_messages_layout);
        View findViewById2 = findViewById(R.id.starred_messages_separator);
        if (j == 0) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        findViewById2.setVisibility(0);
        ((TextView) findViewById(R.id.starred_messages_count)).setText(this.A0A.A0G().format(j));
    }

    public void A0c(Bitmap bitmap) {
        View findViewById = findViewById(R.id.content);
        findViewById.findViewById(R.id.photo_progress).setVisibility(8);
        C15830om r5 = new C15830om(bitmap);
        new AsyncTaskC15820ol(r5, new AnonymousClass2X1(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, r5.A04);
        ((ImageView) findViewById.findViewById(R.id.picture)).setImageBitmap(bitmap);
    }

    public final void A0d(C15870oq r9) {
        C15860op r0;
        int i;
        ChatInfoLayout chatInfoLayout = (ChatInfoLayout) findViewById(R.id.content);
        if (C002001d.A3E(this) || r9 == null) {
            r0 = null;
        } else {
            r0 = (C15860op) r9.A04.get(C15880or.A08);
        }
        if (r0 != null) {
            i = r0.A08;
            chatInfoLayout.setColor(i);
            this.A00 = i;
            if (Build.VERSION.SDK_INT >= 21) {
                float[] A012 = r0.A01();
                A012[2] = (A012[2] * 8.0f) / 10.0f;
                this.A01 = C28051Sr.A0G(A012);
                getWindow().setStatusBarColor(this.A01);
            }
        } else {
            chatInfoLayout.setColor(C004302a.A00(this, R.color.primary));
            this.A00 = C004302a.A00(this, R.color.primary);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A01 = C004302a.A00(this, R.color.primary_dark);
                getWindow().setStatusBarColor(this.A01);
            }
            i = 0;
        }
        int i2 = 16777215 & i;
        findViewById(R.id.bottom_shade).setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, i2}));
        findViewById(R.id.top_shade).setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{855638016, i2}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r14.A09() != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r13.A0B.A0E(A0V()) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0e(X.AnonymousClass0BG r14, android.view.View r15, android.widget.CompoundButton.OnCheckedChangeListener r16) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ChatInfoActivity.A0e(X.0BG, android.view.View, android.widget.CompoundButton$OnCheckedChangeListener):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        if (r8 != 29) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0f(java.util.ArrayList r23) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ChatInfoActivity.A0f(java.util.ArrayList):void");
    }

    public void finishAfterTransition() {
        A0W();
        super.finishAfterTransition();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 34 && i2 == -1) {
            viewMedia(null);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        C007303n A092;
        if (AnonymousClass2UT.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                window.requestFeature(12);
                AnonymousClass1PK r2 = new AnonymousClass1PK(true, false);
                r2.addTarget(this.A06.A01(R.string.transition_photo));
                window.setSharedElementEnterTransition(r2);
                r2.addListener(new AnonymousClass2X2(this));
            }
            Fade fade = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            window.setReturnTransition(fade);
            window.setEnterTransition(fade);
            window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            window.clearFlags(67108864);
        }
        A0A().A0H(5);
        if (!(bundle == null || (A092 = C006803i.A09(bundle, "requested_message")) == null)) {
            this.A03 = (AnonymousClass0M3) this.A0C.A0J.A05(A092);
        }
        super.onCreate(bundle);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        A0W();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            A0W();
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass0M3 r0 = this.A03;
        if (r0 != null) {
            C006803i.A0T(bundle, r0.A0n, "requested_message");
        }
    }

    public final void viewMedia(View view) {
        if (this.A03 != null) {
            AnonymousClass2UQ r1 = new AnonymousClass2UQ(this);
            AnonymousClass02N A0V = A0V();
            if (A0V != null) {
                r1.A03 = A0V;
                r1.A04 = this.A03.A0n;
                r1.A02 = view;
                Intent A002 = r1.A00();
                if (view != null) {
                    AnonymousClass2UT.A03(this, this.A06, A002, view, AbstractC59162nB.A07(this.A03));
                } else {
                    startActivity(A002);
                }
            } else {
                throw null;
            }
        }
    }
}
