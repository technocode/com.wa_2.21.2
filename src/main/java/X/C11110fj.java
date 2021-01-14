package X;

import android.util.SparseArray;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ViewSharedContactArrayActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.0fj  reason: invalid class name and case insensitive filesystem */
public class C11110fj extends AnonymousClass0JW {
    public final AnonymousClass1OU A00;
    public final C017009c A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass09V A05;
    public final AnonymousClass0CN A06;
    public final WeakReference A07;

    public C11110fj(AnonymousClass00G r2, AnonymousClass0CN r3, AnonymousClass01A r4, AnonymousClass01X r5, AnonymousClass09V r6, C017009c r7, ViewSharedContactArrayActivity viewSharedContactArrayActivity, AnonymousClass1OU r9) {
        this.A03 = r2;
        this.A06 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r7;
        this.A07 = new WeakReference(viewSharedContactArrayActivity);
        this.A00 = r9;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r2 = (ActivityC004702f) this.A07.get();
        if (r2 != null) {
            r2.APv(R.string.processing, R.string.register_wait_message);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        int i;
        C007003k A09;
        List<AnonymousClass1Z5> list = (List) obj;
        ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A07.get();
        if (viewSharedContactArrayActivity != null) {
            ((ActivityC004702f) viewSharedContactArrayActivity).A0K.A00();
            if (list == null || list.isEmpty()) {
                Log.w("viewsharedcontactarrayactivity/oncreate/no vcards to display");
                ((ActivityC004702f) viewSharedContactArrayActivity).A0F.A06(R.string.error_parse_vcard, 0);
                viewSharedContactArrayActivity.finish();
                return;
            }
            HashSet hashSet = new HashSet();
            for (AnonymousClass1Z5 r0 : list) {
                AnonymousClass1Z4 r7 = r0.A01;
                String A072 = r7.A07();
                if (!hashSet.contains(A072)) {
                    viewSharedContactArrayActivity.A0M.add(r7);
                    viewSharedContactArrayActivity.A0N.add(new SparseArray());
                    hashSet.add(A072);
                } else if (r7.A05 != null) {
                    ArrayList arrayList = viewSharedContactArrayActivity.A0M;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1Z4 r2 = (AnonymousClass1Z4) it.next();
                        if (r2.A07().equals(A072) && r2.A05 != null && r7.A05.size() > r2.A05.size()) {
                            arrayList.set(arrayList.indexOf(r2), r7);
                        }
                    }
                }
            }
            if (viewSharedContactArrayActivity.A03 == null) {
                Collections.sort(viewSharedContactArrayActivity.A0M, new AnonymousClass1OO(viewSharedContactArrayActivity.A0E));
            }
            ImageView imageView = (ImageView) viewSharedContactArrayActivity.findViewById(R.id.send_btn);
            if (viewSharedContactArrayActivity.A06) {
                imageView.setVisibility(0);
                AnonymousClass01X r4 = viewSharedContactArrayActivity.A0E;
                imageView.setImageDrawable(new C06470Tj(r4, C004302a.A03(viewSharedContactArrayActivity, R.drawable.input_send)));
                AnonymousClass0S2 A092 = viewSharedContactArrayActivity.A09();
                if (A092 != null) {
                    A092.A08(r4.A08(R.plurals.send_contacts, (long) viewSharedContactArrayActivity.A0M.size()));
                } else {
                    throw null;
                }
            } else {
                imageView.setVisibility(8);
                int size = list.size();
                AnonymousClass0S2 A093 = viewSharedContactArrayActivity.A09();
                if (A093 != null) {
                    A093.A08(viewSharedContactArrayActivity.A0E.A0A(R.plurals.view_contacts_title, (long) size, Integer.valueOf(size)));
                } else {
                    throw null;
                }
            }
            RecyclerView recyclerView = (RecyclerView) viewSharedContactArrayActivity.findViewById(R.id.rvContacts);
            ArrayList arrayList2 = viewSharedContactArrayActivity.A0M;
            List list2 = viewSharedContactArrayActivity.A03;
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                AnonymousClass1Z4 r12 = (AnonymousClass1Z4) arrayList2.get(i2);
                SparseArray sparseArray = (SparseArray) viewSharedContactArrayActivity.A0N.get(i2);
                arrayList3.add(new AnonymousClass1OR(r12));
                ArrayList arrayList4 = new ArrayList();
                List<AnonymousClass1Z3> list3 = r12.A05;
                if (list3 != null) {
                    i = 0;
                    for (AnonymousClass1Z3 r22 : list3) {
                        if (r22.A01 == null) {
                            arrayList4.add(r22);
                        } else {
                            arrayList3.add(new AnonymousClass1OP(r22, r12.A08.A08, i2, i));
                            ViewSharedContactArrayActivity.A04(sparseArray, i).A00 = r22;
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                List list4 = r12.A02;
                if (list4 != null) {
                    for (Object obj2 : list4) {
                        arrayList3.add(new AnonymousClass1OP(obj2, r12.A08.A08, i2, i));
                        ViewSharedContactArrayActivity.A04(sparseArray, i).A00 = obj2;
                        i++;
                    }
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    arrayList3.add(new AnonymousClass1OP(next, r12.A08.A08, i2, i));
                    ViewSharedContactArrayActivity.A04(sparseArray, i).A00 = next;
                    i++;
                }
                List list5 = r12.A06;
                if (list5 != null) {
                    for (Object obj3 : list5) {
                        arrayList3.add(new AnonymousClass1OP(obj3, r12.A08.A08, i2, i));
                        ViewSharedContactArrayActivity.A04(sparseArray, i).A00 = obj3;
                        i++;
                    }
                }
                if (r12.A07 != null) {
                    ArrayList arrayList5 = new ArrayList(r12.A07.keySet());
                    Collections.sort(arrayList5);
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        List<C68373Cy> list6 = (List) r12.A07.get(it3.next());
                        if (list6 != null) {
                            for (C68373Cy r1 : list6) {
                                if (r1.A01.equals("URL")) {
                                    Log.d(r1.toString());
                                    Pattern pattern = viewSharedContactArrayActivity.A04;
                                    if (pattern == null) {
                                        pattern = Pattern.compile("(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&amp;=]*)?");
                                        viewSharedContactArrayActivity.A04 = pattern;
                                    }
                                    if (pattern.matcher(r1.A02).matches()) {
                                        arrayList6.add(r1);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        List<C68373Cy> list7 = (List) r12.A07.get(it4.next());
                        if (list7 != null) {
                            for (C68373Cy r13 : list7) {
                                if (!r13.A01.equals("URL")) {
                                    Log.d(r13.toString());
                                    arrayList6.add(r13);
                                }
                            }
                        }
                    }
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        arrayList3.add(new AnonymousClass1OP(next2, r12.A08.A08, i2, i));
                        ViewSharedContactArrayActivity.A04(sparseArray, i).A00 = next2;
                        i++;
                    }
                }
                if (list2 != null) {
                    AnonymousClass1YI r14 = (AnonymousClass1YI) list2.get(i2);
                    UserJid nullable = UserJid.getNullable(r14.A02);
                    if (!(nullable == null || (A09 = viewSharedContactArrayActivity.A09.A09(nullable)) == null)) {
                        arrayList3.add(new AnonymousClass1OT(viewSharedContactArrayActivity, A09, r14.A00, nullable));
                    }
                }
                arrayList3.add(new AnonymousClass1OQ(null));
            }
            ((AnonymousClass1OQ) arrayList3.get(arrayList3.size() - 1)).A00 = true;
            recyclerView.setAdapter(new C40941uA(viewSharedContactArrayActivity, arrayList3));
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            imageView.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(viewSharedContactArrayActivity, 21));
        }
    }
}
