package X;

import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.CameraHomeFragment;
import com.whatsapp.StatusesFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.picker.search.StickerSearchTabFragment;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.0YD  reason: invalid class name */
public abstract class AnonymousClass0YD extends AnonymousClass0YE {
    public AnonymousClass037 A00 = null;
    public AnonymousClass0QC A01 = null;
    public final int A02;
    public final AnonymousClass0LW A03;

    public AnonymousClass0YD(AnonymousClass0LW r2) {
        this.A03 = r2;
        this.A02 = 0;
    }

    public AnonymousClass0YD(AnonymousClass0LW r3, int i) {
        this.A03 = r3;
        this.A02 = 1;
    }

    @Override // X.AnonymousClass0YE
    public Object A05(ViewGroup viewGroup, int i) {
        long A0U;
        if (this.A01 == null) {
            AnonymousClass0LW r1 = this.A03;
            if (r1 != null) {
                this.A01 = new AnonymousClass0QB(r1);
            } else {
                throw null;
            }
        }
        if (!(this instanceof AnonymousClass0YC)) {
            A0U = (long) i;
        } else {
            A0U = (long) ((AnonymousClass0YC) this).A02.A0U(i);
        }
        int id = viewGroup.getId();
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(id);
        sb.append(":");
        sb.append(A0U);
        AnonymousClass037 A012 = this.A03.A0Q.A01(sb.toString());
        if (A012 != null) {
            this.A01.A07(new C09130cL(7, A012));
        } else {
            A012 = A0F(i);
            AnonymousClass0QC r5 = this.A01;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sb2 = new StringBuilder("android:switcher:");
            sb2.append(id3);
            sb2.append(":");
            sb2.append(A0U);
            r5.A0A(id2, A012, sb2.toString(), 1);
        }
        if (A012 != this.A00) {
            A012.A0S(false);
            if (this.A02 == 1) {
                this.A01.A09(A012, EnumC014207z.STARTED);
            } else {
                A012.A0T(false);
                return A012;
            }
        }
        return A012;
    }

    @Override // X.AnonymousClass0YE
    public void A0D(ViewGroup viewGroup, int i, Object obj) {
        AnonymousClass037 r8 = (AnonymousClass037) obj;
        AnonymousClass037 r0 = this.A00;
        if (r8 != r0) {
            if (r0 != null) {
                r0.A0S(false);
                if (this.A02 == 1) {
                    AnonymousClass0QC r2 = this.A01;
                    if (r2 == null) {
                        AnonymousClass0LW r02 = this.A03;
                        if (r02 != null) {
                            r2 = new AnonymousClass0QB(r02);
                            this.A01 = r2;
                        } else {
                            throw null;
                        }
                    }
                    r2.A09(this.A00, EnumC014207z.STARTED);
                } else {
                    this.A00.A0T(false);
                }
            }
            r8.A0S(true);
            if (this.A02 == 1) {
                AnonymousClass0QC r1 = this.A01;
                if (r1 == null) {
                    AnonymousClass0LW r03 = this.A03;
                    if (r03 != null) {
                        r1 = new AnonymousClass0QB(r03);
                        this.A01 = r1;
                    } else {
                        throw null;
                    }
                }
                r1.A09(r8, EnumC014207z.RESUMED);
            } else {
                r8.A0T(true);
            }
            this.A00 = r8;
        }
    }

    public AnonymousClass037 A0F(int i) {
        if (this instanceof C08450b8) {
            return (AnonymousClass037) ((C08450b8) this).A00.get(i);
        }
        if (this instanceof C08460b9) {
            AnonymousClass1Y6 r0 = ((C08460b9) this).A01;
            int A0T = r0.A0T(i);
            if (A0T != 0) {
                if (A0T == 1) {
                    return new QrScanCodeFragment();
                }
                throw new IllegalArgumentException("The item position should be less than: 2");
            } else if (r0 != null) {
                return new ContactQrMyCodeFragment();
            } else {
                throw null;
            }
        } else if (this instanceof C08470bA) {
            Bundle A012 = AnonymousClass008.A01("sticker_category_tab", i);
            StickerSearchTabFragment stickerSearchTabFragment = new StickerSearchTabFragment();
            stickerSearchTabFragment.A0N(A012);
            return stickerSearchTabFragment;
        } else if (this instanceof C08480bB) {
            return (AnonymousClass037) ((C08480bB) this).A01.get(i);
        } else {
            AnonymousClass0YC r2 = (AnonymousClass0YC) this;
            int A0U = r2.A02.A0U(i);
            if (A0U == 100) {
                return new CameraHomeFragment();
            }
            if (A0U == 200) {
                return new ConversationsFragment();
            }
            if (A0U == 300) {
                return new StatusesFragment();
            }
            if (A0U == 400) {
                return new CallsFragment();
            }
            if (A0U == 500) {
                throw new IllegalStateException("Invalid tab id: 500");
            }
            StringBuilder A0S = AnonymousClass008.A0S("The item position should be less or equal to:");
            A0S.append(r2.A00);
            throw new IllegalArgumentException(A0S.toString());
        }
    }
}
