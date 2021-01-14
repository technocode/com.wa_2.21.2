package X;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2my  reason: invalid class name and case insensitive filesystem */
public class C59052my extends AbstractC51572Zg {
    public int A00;
    public C51602Zj A01;
    public AnonymousClass2IP A02;
    public C75073c8 A03;
    public AnonymousClass1Z4 A04;
    public boolean A05;
    public final ImageView A06;
    public final LinearLayout A07;
    public final LinearLayout A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final C26491Ld A0F = C26491Ld.A00();
    public final C09040cC A0G = C09040cC.A00();
    public final AnonymousClass0HJ A0H = AnonymousClass0HJ.A02();
    public final AnonymousClass08B A0I = AnonymousClass08B.A00;
    public final AnonymousClass0YX A0J;
    public final AnonymousClass0HN A0K = AnonymousClass0HN.A00();
    public final AnonymousClass098 A0L = AnonymousClass098.A00();
    public final AnonymousClass36B A0M = AnonymousClass36B.A01();
    public final AnonymousClass00T A0N = C002101e.A00();
    public final AnonymousClass3SQ A0O;
    public final ArrayList A0P = new ArrayList();
    public final ArrayList A0Q = new ArrayList();

    public C59052my(Context context, AbstractC007503q r4, AnonymousClass0YX r5, AnonymousClass3SQ r6) {
        super(context, r4);
        this.A0J = r5;
        this.A0O = r6;
        this.A0E = (TextView) findViewById(R.id.vcard_text);
        this.A09 = (TextView) findViewById(R.id.account_type);
        this.A0C = (TextView) findViewById(R.id.description);
        this.A06 = (ImageView) findViewById(R.id.picture);
        this.A0D = (TextView) findViewById(R.id.msg_contact_btn);
        this.A0A = (TextView) findViewById(R.id.action_contact_btn);
        this.A07 = (LinearLayout) findViewById(R.id.action_view_business_container);
        this.A0B = (TextView) findViewById(R.id.action_view_business);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.contact_card);
        this.A08 = linearLayout;
        linearLayout.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
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
        AbstractC007503q fMessage = getFMessage();
        this.A0E.setTag(fMessage.A0n);
        C75073c8 r1 = this.A03;
        if (r1 != null) {
            this.A0O.A03(r1);
        }
        C75073c8 r3 = (C75073c8) this.A0O.A00(fMessage);
        this.A03 = r3;
        ((C41191ud) r3).A01.A03(new AnonymousClass2ZQ(this), ((AbstractC51572Zg) this).A0V.A06);
        A0k(C002001d.A1f(this.A0n, fMessage));
        this.A0H.A05(this.A06, R.drawable.avatar_contact);
        if (fMessage.A0s(1024)) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.web_page_preview_holder);
            if (viewGroup != null) {
                C64192xm A002 = C64192xm.A00(fMessage);
                viewGroup.setVisibility(0);
                if (this.A02 == null) {
                    AnonymousClass2IP r0 = new AnonymousClass2IP(getContext(), A0H());
                    this.A02 = r0;
                    viewGroup.addView(r0.A0A, -1, -2);
                    this.A02.A0A.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
                }
                boolean A0i = A0i(A002.A03);
                this.A05 = A0i;
                this.A02.A01(fMessage, A0i, this, A002);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.web_page_preview_holder);
        if (viewGroup2 != null) {
            AnonymousClass2IP r02 = this.A02;
            if (r02 != null) {
                viewGroup2.removeView(r02.A0A);
                this.A02 = null;
            }
            viewGroup2.setVisibility(8);
        }
    }

    public final void A0k(String str) {
        String A072 = C003701u.A07(str, 128);
        Context context = getContext();
        TextView textView = this.A0E;
        textView.setText(A0I(C002001d.A1I(A072, context, textView.getPaint(), new AnonymousClass2d9(), this.A10)));
    }

    public final boolean A0l(AnonymousClass1Z4 r7) {
        boolean z;
        if (r7 == null) {
            return false;
        }
        List list = r7.A05;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AbstractC51572Zg) this).A0X.A09(((AnonymousClass1Z3) it.next()).A01)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (list.size() > 0 && !z) {
                return true;
            }
        }
        List<AnonymousClass3D2> list2 = r7.A02;
        if (list2 != null) {
            for (AnonymousClass3D2 r0 : list2) {
                if (r0.A01 == ContactsContract.CommonDataKinds.Email.class) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_contact_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_contact_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        if (this.A05) {
            return (AbstractC59162nB.A04(getContext()) * 72) / 100;
        }
        return super.getMainChildMaxWidth();
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_contact_right;
    }

    @Override // X.AbstractC51572Zg
    public void onDetachedFromWindow() {
        C51602Zj r0 = this.A01;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A01 = null;
        }
        super.onDetachedFromWindow();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A0E.getText());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.A0E.getText());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.AnonymousClass0FI.A0g(r3) != false) goto L_0x000b;
     */
    @Override // X.AnonymousClass2I2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AbstractC007503q r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C04830Lz
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
        throw new UnsupportedOperationException("Method not decompiled: X.C59052my.setFMessage(X.03q):void");
    }
}
