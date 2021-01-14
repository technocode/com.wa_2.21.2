package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import java.util.List;

/* renamed from: X.2mz  reason: invalid class name and case insensitive filesystem */
public class C59062mz extends AbstractC51572Zg {
    public C75073c8 A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final AnonymousClass0HJ A04 = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A05 = AnonymousClass01A.A00();
    public final AnonymousClass0YX A06;
    public final AnonymousClass098 A07 = AnonymousClass098.A00();
    public final AnonymousClass3SQ A08;
    public final ImageView[] A09 = new ImageView[3];

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.ImageView[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: android.widget.ImageView[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: android.widget.ImageView[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C59062mz(Context context, AbstractC007503q r5, AnonymousClass0YX r6, AnonymousClass3SQ r7) {
        super(context, r5);
        this.A06 = r6;
        this.A08 = r7;
        this.A02 = (TextView) findViewById(R.id.vcard_text);
        this.A09[0] = findViewById(R.id.picture);
        this.A09[1] = findViewById(R.id.picture2);
        this.A09[2] = findViewById(R.id.picture3);
        this.A03 = (TextView) findViewById(R.id.view_contacts_btn);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.contact_card);
        this.A01 = linearLayout;
        linearLayout.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this));
        this.A01.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
        A0j();
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0e(false);
        A0j();
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        boolean z;
        C007003k A0A;
        boolean z2;
        AbstractC007503q fMessage = getFMessage();
        int A0C = C002001d.A0C(fMessage);
        TextView textView = this.A02;
        C007303n r6 = fMessage.A0n;
        textView.setTag(r6);
        C75073c8 r1 = this.A00;
        if (r1 != null) {
            this.A08.A03(r1);
        }
        C75073c8 r4 = (C75073c8) this.A08.A00(fMessage);
        this.A00 = r4;
        ((C41191ud) r4).A01.A03(new AnonymousClass2ZR(this), ((AbstractC51572Zg) this).A0V.A06);
        A0k(A0C, null, null);
        if (A0C == 2) {
            this.A09[2].setVisibility(4);
        } else {
            this.A09[2].setVisibility(0);
        }
        if (!r6.A02) {
            AnonymousClass02N r3 = r6.A00;
            boolean z3 = true;
            if (AnonymousClass1VY.A0Y(r3)) {
                AnonymousClass01A r12 = this.A05;
                AnonymousClass02N A072 = fMessage.A07();
                if (A072 != null) {
                    A0A = r12.A0A(A072);
                    z2 = (!this.A14.A0N((AnonymousClass02U) r3)) & this.A07.A06(r3) & true;
                } else {
                    throw null;
                }
            } else {
                AnonymousClass01A r0 = this.A05;
                if (r3 != null) {
                    A0A = r0.A0A(r3);
                    z2 = true;
                } else {
                    throw null;
                }
            }
            if (A0A.A08 != null) {
                z3 = false;
            }
            boolean z4 = z2 & z3;
            AnonymousClass098 r13 = this.A07;
            Jid A022 = A0A.A02(AnonymousClass02N.class);
            if (A022 != null) {
                z = z4 & r13.A06((AnonymousClass02N) A022);
            } else {
                throw null;
            }
        } else {
            z = false;
        }
        View findViewById = findViewById(R.id.button_div);
        if (!z) {
            TextView textView2 = this.A03;
            textView2.setVisibility(0);
            textView2.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this));
            return;
        }
        this.A03.setVisibility(8);
        findViewById.setVisibility(8);
    }

    public final void A0k(int i, String str, List list) {
        int i2 = 0;
        do {
            if (list == null || i2 >= list.size()) {
                this.A04.A05(this.A09[i2], R.drawable.avatar_contact);
            } else {
                this.A06.A07((AnonymousClass1Z4) list.get(i2), this.A09[i2]);
            }
            i2++;
        } while (i2 < 3);
        if (str != null) {
            int i3 = i - 1;
            String A0A = this.A0n.A0A(R.plurals.contacts_array_title, (long) i3, str, Integer.valueOf(i3));
            Context context = getContext();
            TextView textView = this.A02;
            textView.setText(A0I(C002001d.A1I(A0A, context, textView.getPaint(), new AnonymousClass2d9(), this.A10)));
            return;
        }
        this.A02.setText(this.A0n.A0A(R.plurals.n_contacts_message_title, (long) i, Integer.valueOf(i)));
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_contacts_array_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_contacts_array_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_contacts_array_right;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.AnonymousClass0FI.A0g(r3) != false) goto L_0x000b;
     */
    @Override // X.AnonymousClass2I2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AbstractC007503q r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.AnonymousClass0M1
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.AnonymousClass0FI.A0g(r3)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.AnonymousClass00E.A07(r0)
            super.setFMessage(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59062mz.setFMessage(X.03q):void");
    }
}
