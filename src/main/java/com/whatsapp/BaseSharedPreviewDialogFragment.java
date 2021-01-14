package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass088;
import X.AnonymousClass1KV;
import X.AnonymousClass1VY;
import X.C002001d;
import X.C004302a;
import X.C014308b;
import X.C02220Bc;
import X.C06470Tj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import java.util.ArrayList;
import java.util.List;

public class BaseSharedPreviewDialogFragment extends WaDialogFragment {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageButton A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public AnonymousClass1KV A06;
    public WebPagePreviewView A07;
    public EmojiSearchContainer A08;
    public List A09;
    public final AnonymousClass088 A0A = AnonymousClass088.A00();
    public final AnonymousClass02M A0B = AnonymousClass02M.A00();
    public final AnonymousClass01A A0C = AnonymousClass01A.A00();
    public final C014308b A0D = C014308b.A00();
    public final AnonymousClass03P A0E = AnonymousClass03P.A00();
    public final AnonymousClass01X A0F = AnonymousClass01X.A00();
    public final C02220Bc A0G = C02220Bc.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A082;
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            this.A00 = A0A2.getLayoutInflater().inflate(R.layout.base_shared_preview_fragment, viewGroup, false);
            A0I();
            A0s(2, 0);
            this.A00.findViewById(R.id.top_layout);
            this.A04 = (LinearLayout) this.A00.findViewById(R.id.view_placeholder);
            this.A05 = (RelativeLayout) this.A00.findViewById(R.id.footer);
            this.A03 = (ImageButton) this.A00.findViewById(R.id.send);
            this.A02 = (ViewGroup) this.A00.findViewById(R.id.web_page_preview_container);
            this.A01 = this.A00.findViewById(R.id.link_preview_divider);
            this.A02.setVisibility(8);
            this.A01.setVisibility(8);
            EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) this.A00.findViewById(R.id.emoji_search_container);
            this.A08 = emojiSearchContainer;
            emojiSearchContainer.setVisibility(8);
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass02N r2 : this.A09) {
                if (AnonymousClass1VY.A0b(r2)) {
                    A082 = this.A0F.A06(R.string.my_status);
                } else {
                    A082 = this.A0D.A08(this.A0C.A0A(r2), false);
                }
                arrayList.add(0, A082);
            }
            ((TextEmojiLabel) this.A00.findViewById(R.id.recipients)).A02(C002001d.A1g(this.A0D.A02, false, arrayList));
            A0x();
            return this.A00;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0b(Bundle bundle) {
        super.A0b(bundle);
        Toolbar toolbar = (Toolbar) this.A00.findViewById(R.id.toolbar);
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            toolbar.setBackgroundColor(C004302a.A00(A0A2, R.color.primary));
            ActivityC004902h A0A3 = A0A();
            toolbar.A0B = 2131952154;
            TextView textView = toolbar.mTitleTextView;
            if (textView != null) {
                textView.setTextAppearance(A0A3, 2131952154);
            }
            AnonymousClass01X r2 = this.A0F;
            toolbar.setTitle(r2.A06(R.string.send_to));
            toolbar.setNavigationIcon(new C06470Tj(r2, C004302a.A03(A0A(), R.drawable.ic_back)));
            toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 7));
            toolbar.setNavigationContentDescription(r2.A06(R.string.back));
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = ((DialogFragment) this).A03.getWindow();
                if (window != null) {
                    window.clearFlags(67108864);
                    window.setStatusBarColor(C004302a.A00(A0A(), R.color.primary_dark));
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment
    public void A0f() {
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
                dialog.getWindow().getAttributes().windowAnimations = R.style.FullScreenDialogFragmentAnimation;
            } else {
                throw null;
            }
        }
        super.A0f();
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        if (!(A0A() instanceof AnonymousClass1KV)) {
            throw new RuntimeException("Activity must implement BaseSharedPreviewDialogFragment.Host");
        }
    }

    @Override // X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A0w(false, false);
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        AnonymousClass00E.A04(bundle2, "null arguments");
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("jids");
        AnonymousClass00E.A04(stringArrayList, "null jids");
        this.A09 = AnonymousClass1VY.A0G(AnonymousClass02N.class, stringArrayList);
        AnonymousClass1KV r0 = (AnonymousClass1KV) A0A();
        this.A06 = r0;
        if (r0 != null) {
            r0.AP5(this);
        }
        A0s(0, R.style.FullScreenDialogNoFloating);
        return super.A0p(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 != 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0x() {
        /*
            r3 = this;
            android.widget.RelativeLayout r0 = r3.A05
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            com.whatsapp.conversation.conversationrow.WebPagePreviewView r0 = r3.A07
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getVisibility()
            r1 = 2131166030(0x7f07034e, float:1.7946294E38)
            if (r0 == 0) goto L_0x0016
        L_0x0013:
            r1 = 2131166031(0x7f07034f, float:1.7946296E38)
        L_0x0016:
            android.content.res.Resources r0 = r3.A02()
            int r1 = r0.getDimensionPixelSize(r1)
            r2.height = r1
            android.widget.RelativeLayout r0 = r3.A05
            int r0 = r0.getHeight()
            if (r1 == r0) goto L_0x002d
            android.widget.RelativeLayout r0 = r3.A05
            r0.setLayoutParams(r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.BaseSharedPreviewDialogFragment.A0x():void");
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass1KV r0 = this.A06;
        if (r0 != null) {
            r0.AMk();
        }
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
    }
}
