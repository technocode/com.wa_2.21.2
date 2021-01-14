package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1oT  reason: invalid class name and case insensitive filesystem */
public final class C37591oT implements AnonymousClass06J {
    public final List A00;

    public C37591oT(List list) {
        this.A00 = new ArrayList(list);
    }

    @Override // X.AnonymousClass06J
    public Object A20(Object obj) {
        List list;
        boolean z;
        AbstractC009005t r10 = (AbstractC009005t) obj;
        ArrayList arrayList = null;
        int i = 0;
        AbstractC009005t r4 = r10;
        while (true) {
            list = this.A00;
            if (i >= list.size()) {
                break;
            }
            Pair pair = (Pair) list.get(i);
            if (((AnonymousClass1GO) pair.first).AQT(r4)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(pair);
                AbstractC25361Gp r6 = (AbstractC25361Gp) pair.second;
                if (!(r6 instanceof C38051pF)) {
                    z = true;
                } else {
                    C38051pF r62 = (C38051pF) r6;
                    try {
                        z = r62.A00.APc(r4, r62.A02, r62.A01);
                    } catch (IOException unused) {
                        z = true;
                    }
                }
                if (z) {
                    if (r4 == r10) {
                        r4 = r10.ABs();
                    }
                    AbstractC25361Gp r5 = (AbstractC25361Gp) pair.second;
                    if (r5 instanceof C38051pF) {
                        C38051pF r52 = (C38051pF) r5;
                        try {
                            AnonymousClass1Gq r1 = r52.A00;
                            String str = r52.A02;
                            if (!r1.AOv(r4, str, r52.A01)) {
                                String format = String.format("Unhandled setProp operation key: %s", str);
                                StringBuilder sb = new StringBuilder("[");
                                sb.append("PropUpdateOperation");
                                sb.append("] ");
                                sb.append(format);
                                Log.e(sb.toString());
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (r5 instanceof C37841os) {
                        ((C46422Aa) r4).A0J = ((C37841os) r5).A00;
                    } else if (r5 instanceof C37551oP) {
                        C37551oP r53 = (C37551oP) r5;
                        AnonymousClass07B r7 = (AnonymousClass07B) r4;
                        int A05 = C008805h.A05(r7.A5H(), r53.A00);
                        if (A05 < 0) {
                            android.util.Log.w("ComponentTree", "replaceChild: No existing child found with specified ID in parent. New children have not been added to parent.");
                        } else {
                            r7.A5H().remove(A05);
                            r7.A5H().addAll(A05, C008805h.A0o(r53.A01));
                        }
                    } else if (r5 instanceof C37541oO) {
                        C37541oO r54 = (C37541oO) r5;
                        AnonymousClass07B r8 = (AnonymousClass07B) r4;
                        int A052 = C008805h.A05(r8.A5H(), r54.A00);
                        if (A052 < 0) {
                            android.util.Log.w("ComponentTreeMutator", "replaceChildrenAfter: No existing child found with specified ID in parent. New children have not been added to parent.");
                        } else {
                            int size = r8.A5H().size();
                            while (true) {
                                size--;
                                if (size <= A052) {
                                    break;
                                }
                                r8.A5H().remove(size);
                            }
                            r8.A5H().addAll(A052 + 1, C008805h.A0o(r54.A01));
                        }
                    } else if (r5 instanceof C37531oN) {
                        AnonymousClass07B r72 = (AnonymousClass07B) r4;
                        int A053 = C008805h.A05(r72.A5H(), ((C37531oN) r5).A00);
                        if (A053 < 0) {
                            android.util.Log.w("ComponentTreeMutator", "removeChildById: No existing child found with specified ID in parent. No child has been removed from the parent.");
                        } else {
                            r72.A5H().remove(A053);
                        }
                    } else if (r5 instanceof C37521oM) {
                        C37521oM r55 = (C37521oM) r5;
                        AnonymousClass07B r82 = (AnonymousClass07B) r4;
                        int A054 = C008805h.A05(r82.A5H(), r55.A01);
                        int A055 = C008805h.A05(r82.A5H(), r55.A00);
                        if (A054 == -1) {
                            android.util.Log.w("ComponentTree", "removeChildren: The starting id doesn't exist. No children have been removed.");
                        } else if (A055 == -1) {
                            android.util.Log.w("ComponentTree", "removeChildren: The ending id doesn't exist. No children have been removed.");
                        } else if (A054 > A055) {
                            android.util.Log.w("ComponentTree", "removeChildren: The starting index is larger than the ending index. No children have been removed.");
                        } else {
                            Iterator it = r82.A5H().iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                it.next();
                                if (i2 > A054 && i2 < A055) {
                                    it.remove();
                                }
                                i2++;
                            }
                        }
                    } else if (r5 instanceof C37511oL) {
                        ((AnonymousClass07B) r4).A5H().remove(((C37511oL) r5).A00);
                    } else if (r5 instanceof C37501oK) {
                        C37501oK r56 = (C37501oK) r5;
                        AnonymousClass07B r73 = (AnonymousClass07B) r4;
                        int A056 = C008805h.A05(r73.A5H(), r56.A01);
                        if (A056 < 0) {
                            android.util.Log.w("ComponentTree", "insertChildrenRelativeToId: No existing child found with specified ID in parent. New children have not been added to parent.");
                        } else {
                            r73.A5H().addAll(A056 + r56.A00, C008805h.A0o(r56.A02));
                        }
                    } else if (r5 instanceof C37491oJ) {
                        ((AnonymousClass07B) r4).A5H().addAll(C008805h.A0o(((C37491oJ) r5).A00));
                    } else if (r5 instanceof C37481oI) {
                        ((AnonymousClass07B) r4).A5H().addAll(0, C008805h.A0o(((C37481oI) r5).A00));
                    } else if (!(r5 instanceof C37471oH)) {
                        AnonymousClass07B r12 = (AnonymousClass07B) r4;
                        r12.A5H().clear();
                        r12.A5H().addAll(C008805h.A0o(((C37461oG) r5).A00));
                    } else {
                        C37471oH r57 = (C37471oH) r5;
                        AnonymousClass07B r13 = (AnonymousClass07B) r4;
                        int i3 = r57.A00;
                        if (i3 == -1) {
                            i3 = r13.A5H().size();
                        }
                        r13.A5H().add(i3, r57.A01);
                    }
                }
            }
            i++;
        }
        if (arrayList != null) {
            list.removeAll(arrayList);
        }
        return r4;
    }

    @Override // X.AnonymousClass06J
    public void ALW(Object obj) {
    }
}
