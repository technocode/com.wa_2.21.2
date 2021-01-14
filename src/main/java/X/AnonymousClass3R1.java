package X;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3R1  reason: invalid class name */
public class AnonymousClass3R1 extends AnonymousClass0JW {
    public AbstractC662633n A00;
    public final C03570Gt A01;

    public AnonymousClass3R1(C03570Gt r1) {
        this.A01 = r1;
    }

    public AnonymousClass3R1(C03570Gt r1, AbstractC662633n r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object... objArr) {
        AbstractC662633n r2;
        if (!super.A00.isCancelled() && (r2 = this.A00) != null) {
            Object obj = objArr[0];
            if (obj instanceof C662333k) {
                r2.AIB((C662333k) obj);
            } else if (obj instanceof AnonymousClass33N) {
                r2.AIA((AnonymousClass33N) obj);
            } else if (obj instanceof String) {
                r2.AID((String) obj);
            }
        }
    }

    @Override // X.AnonymousClass0JW
    public /* bridge */ /* synthetic */ Object A02(Object[] objArr) {
        if (!(this instanceof C74173aI)) {
            return A04((Void[]) objArr);
        }
        A04((Void[]) objArr);
        return null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC662633n r0 = this.A00;
        if (r0 != null) {
            r0.AIC();
        }
        this.A00 = null;
    }

    public Void A04(Void... voidArr) {
        AsyncTaskC09770dV r6 = super.A00;
        if (r6.isCancelled()) {
            return null;
        }
        C03570Gt r4 = this.A01;
        List A0C = r4.A0C();
        if (r6.isCancelled()) {
            return null;
        }
        List A0B = r4.A0B();
        if (r6.isCancelled()) {
            return null;
        }
        r6.A00(new C662333k(A0C, A0B));
        if (r6.isCancelled()) {
            return null;
        }
        List A0F = r4.A0F(new AnonymousClass3R0(this));
        HashSet hashSet = new HashSet();
        Iterator it = ((AbstractCollection) A0F).iterator();
        while (it.hasNext()) {
            hashSet.add(((AnonymousClass33N) it.next()).A0D);
        }
        Iterator it2 = ((AbstractCollection) A0B).iterator();
        while (it2.hasNext()) {
            AnonymousClass33N r2 = (AnonymousClass33N) it2.next();
            String str = r2.A0D;
            if (!hashSet.contains(str)) {
                AnonymousClass008.A1T(AnonymousClass008.A0S("LoadStickerPickerPacksAsyncTask/doInBackground failed to load pack "), str);
                r6.A00(r2);
            }
        }
        return null;
    }
}
