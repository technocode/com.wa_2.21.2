package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;

/* renamed from: X.3aN  reason: invalid class name and case insensitive filesystem */
public class C74223aN extends AnonymousClass3RI {
    public int A00;
    public View A01;
    public TextView A02;
    public CircularProgressBar A03;
    public AnonymousClass33N A04;
    public final AnonymousClass01X A05;
    public final AnonymousClass0D1 A06;
    public final C03570Gt A07;
    public final AnonymousClass33U A08;

    public C74223aN(C002701k r1, Context context, LayoutInflater layoutInflater, AnonymousClass01X r4, C03570Gt r5, AnonymousClass0D1 r6, AnonymousClass33U r7, int i, AnonymousClass33N r9) {
        super(r1, context, layoutInflater, i);
        this.A05 = r4;
        this.A07 = r5;
        this.A06 = r6;
        this.A04 = r9;
        this.A08 = r7;
    }

    @Override // X.AnonymousClass3RI
    public void A03(View view) {
        View findViewById = view.findViewById(R.id.pack_loading);
        if (findViewById != null) {
            this.A03 = (CircularProgressBar) findViewById;
            View findViewById2 = view.findViewById(R.id.pack_loading_text);
            if (findViewById2 != null) {
                this.A02 = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.cancel_button);
                if (findViewById3 != null) {
                    this.A01 = findViewById3;
                    findViewById3.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 14));
                    A05();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A05() {
        View view;
        if (!(this instanceof C75063c4)) {
            CircularProgressBar circularProgressBar = this.A03;
            if (circularProgressBar != null && this.A02 != null && (view = this.A01) != null) {
                if (this.A04.A05) {
                    circularProgressBar.setVisibility(0);
                    this.A02.setVisibility(0);
                    this.A01.setVisibility(0);
                    if (TextUtils.isEmpty(this.A04.A0F)) {
                        this.A02.setText(this.A05.A06(R.string.sticker_pack_downloading));
                    } else {
                        this.A02.setText(this.A05.A0D(R.string.sticker_pack_downloading_with_name, this.A04.A0F));
                    }
                    if (this.A00 >= 0) {
                        this.A03.setIndeterminate(false);
                        this.A03.setProgress(this.A00);
                        return;
                    }
                    this.A03.setIndeterminate(true);
                    return;
                }
                view.setVisibility(8);
                this.A03.setVisibility(8);
                this.A02.setVisibility(8);
                return;
            }
            return;
        }
        C75063c4 r5 = (C75063c4) this;
        CircularProgressBar circularProgressBar2 = ((C74223aN) r5).A03;
        if (!(circularProgressBar2 == null || ((C74223aN) r5).A02 == null)) {
            if (r5.A02) {
                circularProgressBar2.setVisibility(0);
                ((C74223aN) r5).A02.setVisibility(0);
                if (TextUtils.isEmpty(((C74223aN) r5).A04.A0F)) {
                    ((C74223aN) r5).A02.setText(((C74223aN) r5).A05.A06(R.string.sticker_pack_loading));
                } else {
                    ((C74223aN) r5).A02.setText(((C74223aN) r5).A05.A0D(R.string.sticker_pack_loading_with_name, ((C74223aN) r5).A04.A0F));
                }
            } else {
                circularProgressBar2.setVisibility(8);
                ((C74223aN) r5).A02.setVisibility(8);
            }
        }
        if (r5.A00 == null) {
            return;
        }
        if (((C74223aN) r5).A04.A04.size() != 0 || r5.A02) {
            r5.A00.setVisibility(8);
            return;
        }
        r5.A00.setVisibility(0);
        r5.A01.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(r5, 46));
    }
}
