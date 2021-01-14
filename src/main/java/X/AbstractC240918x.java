package X;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.18x  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC240918x {
    public Bundle A00;
    public AbstractC241018y A01;
    public LinkedList A02;
    public final AbstractC241118z A03 = new C35451kN(this);

    public final void A00(int i) {
        while (!this.A02.isEmpty() && ((AbstractC240818w) this.A02.getLast()).A9B() >= i) {
            this.A02.removeLast();
        }
    }

    public final void A01(Bundle bundle, AbstractC240818w r8) {
        AbstractC241018y r0 = this.A01;
        if (r0 != null) {
            r8.ARU(r0);
            return;
        }
        LinkedList linkedList = this.A02;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.A02 = linkedList;
        }
        linkedList.add(r8);
        if (bundle != null) {
            Bundle bundle2 = this.A00;
            if (bundle2 == null) {
                this.A00 = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        AbstractC241118z r02 = this.A03;
        C35931lJ r5 = (C35931lJ) this;
        r5.A00 = r02;
        if (r02 != null && ((AbstractC240918x) r5).A01 == null) {
            try {
                Context context = r5.A01;
                AnonymousClass1B7.A00(context);
                IMapViewDelegate ARp = AnonymousClass1BK.A01(context).ARp(new BinderC04800Lv(context), r5.A03);
                if (ARp != null) {
                    AbstractC241118z r2 = r5.A00;
                    C35921lI r03 = new C35921lI(r5.A02, ARp);
                    AbstractC240918x r3 = ((C35451kN) r2).A00;
                    r3.A01 = r03;
                    Iterator it = r3.A02.iterator();
                    while (it.hasNext()) {
                        ((AbstractC240818w) it.next()).ARU(r3.A01);
                    }
                    r3.A02.clear();
                    r3.A00 = null;
                    List<AnonymousClass1B8> list = r5.A04;
                    for (AnonymousClass1B8 r22 : list) {
                        try {
                            ((C35921lI) ((AbstractC240918x) r5).A01).A02.A7D(new AnonymousClass26d(r22));
                        } catch (RemoteException e) {
                            throw new AnonymousClass06B(e);
                        }
                    }
                    list.clear();
                }
            } catch (RemoteException e2) {
                throw new AnonymousClass06B(e2);
            } catch (AnonymousClass16s unused) {
            }
        }
    }
}
