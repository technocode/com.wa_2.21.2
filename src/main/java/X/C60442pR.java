package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2pR  reason: invalid class name and case insensitive filesystem */
public class C60442pR extends AbstractC59032mw implements AbstractC661433b {
    public View A00;
    public View A01;
    public AnonymousClass0D1 A02;
    public ArrayList A03;
    public boolean A04;
    public final AnonymousClass03S A05;
    public final C04420Kh A06;
    public final AnonymousClass0CH A07;
    public final ArrayList A08 = new ArrayList();

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return 0;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        return 0;
    }

    @Override // X.AbstractC59032mw
    public int getMaxAlbumSize() {
        return 2;
    }

    @Override // X.AbstractC59032mw
    public int getMinAlbumSize() {
        return 2;
    }

    public C60442pR(Context context, AnonymousClass0M3 r5, AnonymousClass0D1 r6) {
        super(context, r5);
        C04420Kh A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = C04420Kh.A00();
        }
        this.A06 = A002;
        this.A05 = AnonymousClass03S.A00();
        this.A07 = AnonymousClass0CH.A00();
        this.A02 = r6;
        this.A01 = findViewById(R.id.sticker_bubble_header);
        this.A00 = findViewById(R.id.name_in_group);
        this.A08.add(new AnonymousClass2IO(this, findViewById(R.id.sticker_1)));
        this.A08.add(new AnonymousClass2IO(this, findViewById(R.id.sticker_2)));
    }

    private void A05(boolean z) {
        if (this.A03 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A08;
                if (i < arrayList.size()) {
                    ArrayList arrayList2 = this.A03;
                    if (i < arrayList2.size()) {
                        ((AnonymousClass2IO) arrayList.get(i)).A01((AnonymousClass0M3) arrayList2.get(i), z);
                    } else {
                        ((AnonymousClass2IO) arrayList.get(i)).A01(null, z);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // X.AnonymousClass2I2
    public int A0A() {
        if (this.A01 == null) {
            return super.A0A();
        }
        return this.A01.getBottom() + ((AnonymousClass2I2) this).A0C.getTop();
    }

    @Override // X.AnonymousClass2I2
    public int A0B() {
        if (!this.A04 || this.A01 == null) {
            return super.A0B();
        }
        return this.A01.getPaddingTop() + ((AnonymousClass2I2) this).A0C.getTop();
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A05(false);
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r2, boolean z) {
        super.A0Z(super.getFMessage(), z);
        if (z) {
            A05(false);
        }
        A0k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (super.getFMessage() != r7.get(0)) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (((X.AbstractC007503q) r7.get(0)).A0n.A02 != false) goto L_0x002e;
     */
    @Override // X.AbstractC59032mw
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0j(java.util.ArrayList r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60442pR.A0j(java.util.ArrayList, boolean):void");
    }

    public final void A0k() {
        if (this.A03 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A08;
                if (i < arrayList.size()) {
                    if (i < this.A03.size()) {
                        AnonymousClass2IO r3 = (AnonymousClass2IO) arrayList.get(i);
                        AbstractC43421yL rowsContainer = r3.A09.getRowsContainer();
                        if (rowsContainer == null || !rowsContainer.AAO()) {
                            View view = r3.A01;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        } else {
                            r3.A00();
                            r3.A01.setSelected(rowsContainer.ABK(r3.A03));
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC661433b
    public void AQ2() {
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((AnonymousClass2IO) it.next()).A08.A00();
        }
    }

    @Override // X.AnonymousClass2I2
    public int getBubbleAlpha() {
        if (this.A04) {
            return super.getBubbleAlpha();
        }
        return 0;
    }

    @Override // X.AnonymousClass2I2
    public int getContentWidth() {
        if (!this.A04 || super.getFMessage().A09() != null || this.A01 == null) {
            return super.getContentWidth();
        }
        return this.A00.getMeasuredWidth();
    }

    @Override // X.AnonymousClass2I2
    public AnonymousClass0M3 getFMessage() {
        return (AnonymousClass0M3) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_sticker_album_left;
    }

    @Override // X.AbstractC51572Zg, X.AbstractC59032mw
    public int getMessageCount() {
        ArrayList arrayList = this.A03;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_sticker_album_right;
    }
}
