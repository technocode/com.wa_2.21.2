package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0YE  reason: invalid class name */
public abstract class AnonymousClass0YE {
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    public void A0D(ViewGroup viewGroup, int i, Object obj) {
    }

    public float A00(int i) {
        if (!(this instanceof C08440b7)) {
            return 1.0f;
        }
        return ((C08440b7) this).A00.A00(i);
    }

    public int A01() {
        if (this instanceof C08390b2) {
            C08390b2 r2 = (C08390b2) this;
            int size = r2.A04.size();
            List list = r2.A06;
            return list != null ? size + list.size() : size;
        } else if (this instanceof C08410b4) {
            List list2 = ((C08410b4) this).A00.A0A;
            if (list2 == null) {
                return 0;
            }
            return list2.size();
        } else if (this instanceof C08420b5) {
            return ((C08420b5) this).A02.A0C.length;
        } else {
            if (this instanceof C08430b6) {
                List list3 = ((C08430b6) this).A00.A0W;
                if (list3 == null) {
                    return 0;
                }
                return list3.size();
            } else if (this instanceof C08440b7) {
                AnonymousClass0YE r1 = ((C08440b7) this).A00;
                if (r1.A01() > 0) {
                    return Integer.MAX_VALUE;
                }
                return r1.A01();
            } else if (this instanceof C08450b8) {
                return ((C08450b8) this).A00.size();
            } else {
                if (this instanceof C08460b9) {
                    return 2;
                }
                if (this instanceof C08470bA) {
                    return 7;
                }
                if (this instanceof C08480bB) {
                    return ((C08480bB) this).A01.size();
                }
                if (this instanceof AnonymousClass0YC) {
                    return ((AnonymousClass0YC) this).A00;
                }
                if (this instanceof C75003bx) {
                    StatusPlaybackActivity statusPlaybackActivity = ((C75003bx) this).A05;
                    AnonymousClass32N r12 = statusPlaybackActivity.A09;
                    if (r12 == null || !statusPlaybackActivity.A0D) {
                        return 0;
                    }
                    return r12.A00.size();
                } else if (this instanceof AnonymousClass3Z2) {
                    return ((AnonymousClass3Z2) this).A01.length;
                } else {
                    if (this instanceof C08500bE) {
                        return ((C08500bE) this).A00.getCount();
                    }
                    if (!(this instanceof C59792oI)) {
                        return ((AnonymousClass27L) this).A01.A0D.length;
                    }
                    return ((C59792oI) this).A04.A0T.size();
                }
            }
        }
    }

    public int A02(Object obj) {
        if (this instanceof C08420b5) {
            C08420b5 r5 = (C08420b5) this;
            if (!((ActivityC004702f) r5.A02).A0G.A0D(AbstractC000400g.A2e) || !(obj instanceof AnonymousClass31h)) {
                return -1;
            }
            Object tag = ((View) obj).getTag();
            if (!(tag instanceof Integer)) {
                return -1;
            }
            int intValue = ((Number) tag).intValue();
            Map map = r5.A01;
            Integer valueOf = Integer.valueOf(intValue);
            if (!map.containsKey(valueOf) || Boolean.valueOf(r5.A00).equals(map.get(valueOf))) {
                return -1;
            }
            return -2;
        } else if (this instanceof C08440b7) {
            return ((C08440b7) this).A00.A02(obj);
        } else {
            if (!(this instanceof AbstractC08510bF)) {
                return -1;
            }
            return ((AbstractC08510bF) this).A0F(obj);
        }
    }

    public Parcelable A03() {
        Bundle bundle;
        if (this instanceof C75003bx) {
            C75003bx r6 = (C75003bx) this;
            C015008i r9 = r6.A03;
            int i = 0;
            if (r9.A00() > 0) {
                bundle = new Bundle();
                long[] jArr = new long[r9.A00()];
                for (int i2 = 0; i2 < r9.A00(); i2++) {
                    C15410o2 r2 = (C15410o2) r9.A02(i2);
                    if (r9.A01) {
                        r9.A05();
                    }
                    long j = r9.A02[i2];
                    jArr[i2] = j;
                    bundle.putParcelable(Long.toString(j), r2);
                }
                bundle.putLongArray("states", jArr);
            } else {
                bundle = null;
            }
            while (true) {
                C015008i r1 = r6.A02;
                if (i >= r1.A00()) {
                    return bundle;
                }
                AnonymousClass037 r3 = (AnonymousClass037) r1.A02(i);
                if (r3 != null && r3.A0U()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("f");
                    if (r1.A01) {
                        r1.A05();
                    }
                    A0S.append(r1.A02[i]);
                    String obj = A0S.toString();
                    AnonymousClass0LW r22 = r6.A04;
                    if (r22 == null) {
                        throw null;
                    } else if (r3.A0H == r22) {
                        bundle.putString(obj, r3.A0S);
                    } else {
                        r22.A0j(new IllegalStateException(AnonymousClass008.A0C(r3, " is not currently in the FragmentManager")));
                        throw null;
                    }
                }
                i++;
            }
        } else if (!(this instanceof C08440b7)) {
            return null;
        } else {
            return ((C08440b7) this).A00.A03();
        }
    }

    public CharSequence A04(int i) {
        if (this instanceof C08500bE) {
            return "";
        }
        if (this instanceof C08440b7) {
            AnonymousClass0YE r1 = ((C08440b7) this).A00;
            if (r1.A01() > 0) {
                return r1.A04(i % r1.A01());
            }
            Log.i("infinitepageadapter/getpagetitle/count is zero");
            return null;
        } else if (this instanceof C08460b9) {
            AnonymousClass1Y6 r2 = ((C08460b9) this).A01;
            int A0T = r2.A0T(i);
            if (A0T == 0) {
                return r2.A0O.A06(R.string.contact_qr_my_code);
            }
            if (A0T == 1) {
                return r2.A0O.A06(R.string.contact_qr_scan_code);
            }
            throw new IllegalArgumentException("The item position should be less than: 2");
        } else if (this instanceof C08480bB) {
            return (CharSequence) ((C08480bB) this).A00.get(i);
        } else {
            if (!(this instanceof AnonymousClass0YC)) {
                return null;
            }
            AnonymousClass0YC r3 = (AnonymousClass0YC) this;
            HomeActivity homeActivity = r3.A02;
            int A0U = homeActivity.A0U(i);
            if (A0U == 100) {
                return "";
            }
            if (A0U == 200) {
                return ((AnonymousClass2C0) homeActivity).A01.A06(R.string.chats);
            }
            if (A0U == 300) {
                return ((AnonymousClass2C0) homeActivity).A01.A06(R.string.statuses);
            }
            if (A0U == 400) {
                return ((AnonymousClass2C0) homeActivity).A01.A06(R.string.calls);
            }
            if (A0U == 500) {
                return "";
            }
            StringBuilder A0S = AnonymousClass008.A0S("The item position should be less or equal to:");
            A0S.append(r3.A00);
            throw new IllegalArgumentException(A0S.toString());
        }
    }

    public Object A05(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void A06() {
        if (!(this instanceof C08440b7)) {
            synchronized (this) {
                DataSetObserver dataSetObserver = this.A00;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            }
            this.A01.notifyChanged();
            return;
        }
        ((C08440b7) this).A00.A06();
    }

    public void A07(DataSetObserver dataSetObserver) {
        if (!(this instanceof C08440b7)) {
            this.A01.registerObserver(dataSetObserver);
        } else {
            ((C08440b7) this).A00.A07(dataSetObserver);
        }
    }

    public void A08(DataSetObserver dataSetObserver) {
        if (!(this instanceof C08440b7)) {
            this.A01.unregisterObserver(dataSetObserver);
        } else {
            ((C08440b7) this).A00.A08(dataSetObserver);
        }
    }

    public void A09(Parcelable parcelable, ClassLoader classLoader) {
        if (this instanceof C75003bx) {
            C75003bx r5 = (C75003bx) this;
            if (parcelable != null) {
                Bundle bundle = (Bundle) parcelable;
                bundle.setClassLoader(classLoader);
                long[] longArray = bundle.getLongArray("states");
                C015008i r8 = r5.A03;
                r8.A04();
                C015008i r6 = r5.A02;
                r6.A04();
                if (longArray != null) {
                    for (long j : longArray) {
                        r8.A08(j, bundle.getParcelable(Long.toString(j)));
                    }
                }
                for (T t : bundle.keySet()) {
                    if (t.startsWith("f")) {
                        AnonymousClass0LW r82 = r5.A04;
                        if (r82 != null) {
                            String string = bundle.getString(t);
                            if (string == null) {
                                AnonymousClass008.A1B("Bad fragment at key ", t, "FragmentPagerAdapter");
                            } else {
                                AnonymousClass037 A002 = r82.A0Q.A00(string);
                                if (A002 != null) {
                                    A002.A0S(false);
                                    r6.A08(Long.parseLong(t.substring(1)), A002);
                                } else {
                                    r82.A0j(new IllegalStateException(AnonymousClass008.A0M("Fragment no longer exists for key ", t, ": unique id ", string)));
                                    throw null;
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }
        } else if (this instanceof C08440b7) {
            ((C08440b7) this).A00.A09(parcelable, classLoader);
        }
    }

    public void A0A(ViewGroup viewGroup) {
        AnonymousClass0YD r1;
        AnonymousClass0QC r0;
        if (this instanceof C75003bx) {
            C75003bx r12 = (C75003bx) this;
            AnonymousClass0QC r02 = r12.A01;
            if (r02 != null) {
                r02.A04();
                r12.A01 = null;
            }
        } else if (this instanceof C08500bE) {
            ((C08500bE) this).A00.AGD();
        } else if (this instanceof C59792oI) {
            C59792oI r2 = (C59792oI) this;
            AnonymousClass0QC r03 = r2.A02;
            if (r03 != null) {
                r03.A04();
                r2.A02 = null;
            }
            MediaPreviewActivity mediaPreviewActivity = r2.A04;
            if (mediaPreviewActivity.A01 < 0 && !mediaPreviewActivity.A0T.isEmpty()) {
                if (mediaPreviewActivity != null) {
                    mediaPreviewActivity.A0d(0);
                } else {
                    throw null;
                }
            }
            Iterator it = ((AbstractCollection) mediaPreviewActivity.A0D()).iterator();
            while (it.hasNext()) {
                AnonymousClass037 r22 = (AnonymousClass037) it.next();
                if (r22 instanceof MediaPreviewFragment) {
                    MediaPreviewFragment mediaPreviewFragment = (MediaPreviewFragment) r22;
                    mediaPreviewFragment.A0s(mediaPreviewActivity.A0e);
                    if (mediaPreviewActivity.A0W && mediaPreviewFragment.A00.equals(mediaPreviewActivity.A4k())) {
                        mediaPreviewFragment.A0o();
                        mediaPreviewFragment.A0n();
                    }
                }
            }
        } else if (this instanceof C08440b7) {
            ((C08440b7) this).A00.A0A(viewGroup);
        } else if ((this instanceof AnonymousClass0YD) && (r0 = (r1 = (AnonymousClass0YD) this).A01) != null) {
            try {
                r0.A04();
            } catch (IllegalStateException unused) {
                r1.A01.A01();
            }
            r1.A01 = null;
        }
    }

    public void A0B(ViewGroup viewGroup) {
        if (!(this instanceof C75003bx)) {
            if (this instanceof C08440b7) {
                ((C08440b7) this).A00.A0B(viewGroup);
            } else if ((this instanceof AnonymousClass0YD) && viewGroup.getId() == -1) {
                StringBuilder sb = new StringBuilder("ViewPager with adapter ");
                sb.append(this);
                sb.append(" requires a view id");
                throw new IllegalStateException(sb.toString());
            }
        } else if (viewGroup.getId() == -1) {
            StringBuilder sb2 = new StringBuilder("ViewPager with adapter ");
            sb2.append(this);
            sb2.append(" requires a view id");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void A0C(ViewGroup viewGroup, int i, Object obj) {
        Bundle A002;
        if (this instanceof AbstractC08400b3) {
            AbstractC08400b3 r1 = (AbstractC08400b3) this;
            if (r1 instanceof C08390b2) {
                viewGroup.removeView((View) obj);
                AnonymousClass0JW r0 = (AnonymousClass0JW) ((C08390b2) r1).A07.remove(Integer.valueOf(i));
                if (r0 != null) {
                    r0.A00.cancel(true);
                }
            } else if (!(r1 instanceof C08410b4)) {
                viewGroup.removeView((View) obj);
            } else {
                viewGroup.removeView((View) obj);
                AnonymousClass0JW r02 = (AnonymousClass0JW) ((C08410b4) r1).A00.A0D.remove(Integer.valueOf(i));
                if (r02 != null) {
                    r02.A00.cancel(true);
                }
            }
        } else if (this instanceof C08430b6) {
            viewGroup.removeView((View) obj);
        } else if (this instanceof C08440b7) {
            AnonymousClass0YE r12 = ((C08440b7) this).A00;
            if (r12.A01() <= 0) {
                Log.i("infinitepageadapter/destroyitem/count is zero");
            } else {
                r12.A0C(viewGroup, i % r12.A01(), obj);
            }
        } else if (this instanceof AbstractC08510bF) {
            AbstractC08510bF r5 = (AbstractC08510bF) this;
            if (r5 instanceof C75003bx) {
                C75003bx r52 = (C75003bx) r5;
                AnonymousClass037 r122 = (AnonymousClass037) obj;
                int A0F = r52.A0F(r122);
                C015008i r7 = r52.A02;
                if (r7.A01) {
                    r7.A05();
                }
                int i2 = 0;
                while (true) {
                    if (i2 < r7.A00) {
                        if (r7.A03[i2] == r122) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                long j = -1;
                if (i2 != -1) {
                    if (r7.A01) {
                        r7.A05();
                    }
                    j = r7.A02[i2];
                    Object[] objArr = r7.A03;
                    Object obj2 = objArr[i2];
                    Object obj3 = C015008i.A04;
                    if (obj2 != obj3) {
                        objArr[i2] = obj3;
                        r7.A01 = true;
                    }
                }
                if (!r122.A0U() || A0F == -2) {
                    r52.A03.A06(j);
                } else {
                    C015008i r72 = r52.A03;
                    AnonymousClass0LW r4 = r52.A04;
                    C09450cu r6 = (C09450cu) r4.A0Q.A01.get(r122.A0S);
                    if (r6 != null) {
                        AnonymousClass037 r3 = r6.A01;
                        if (r3.equals(r122)) {
                            int i3 = r3.A04;
                            C15410o2 r32 = null;
                            if (i3 > -1 && (A002 = r6.A00()) != null) {
                                r32 = new C15410o2(A002);
                            }
                            r72.A08(j, r32);
                        }
                    }
                    r4.A0j(new IllegalStateException(AnonymousClass008.A0C(r122, " is not currently in the FragmentManager")));
                    throw null;
                }
                AnonymousClass0QC r13 = r52.A01;
                if (r13 == null) {
                    AnonymousClass0LW r03 = r52.A04;
                    if (r03 != null) {
                        r13 = new AnonymousClass0QB(r03);
                        r52.A01 = r13;
                    } else {
                        throw null;
                    }
                }
                r13.A03(r122);
            } else if (r5 instanceof AnonymousClass3Z2) {
                AnonymousClass3Z2 r53 = (AnonymousClass3Z2) r5;
                View view = (View) obj;
                if (!r53.A02.A0M()) {
                    i = (r53.A01.length - 1) - i;
                }
                Object tag = view.getTag();
                viewGroup.removeView(view);
                AbstractC63942xG r2 = (AbstractC63942xG) r53.A00.remove(tag);
                if (r2 != null) {
                    Iterator it = r53.A05.iterator();
                    while (it.hasNext()) {
                        r2.AMh((AbstractC16450pp) it.next());
                    }
                    r2.AEw(viewGroup, i, view);
                }
            } else if (r5 instanceof C08500bE) {
                C08500bE r54 = (C08500bE) r5;
                Object obj4 = ((AnonymousClass02R) obj).A00;
                if (obj4 != null) {
                    View view2 = (View) obj4;
                    viewGroup.removeView(view2);
                    PhotoView.A00(view2);
                }
                r54.A00.A3f(i);
            } else if (!(r5 instanceof C59792oI)) {
                View view3 = (View) obj;
                viewGroup.removeView(view3);
                ((AbsListView) view3.findViewById(16908298)).setOnScrollListener(null);
            } else {
                C59792oI r55 = (C59792oI) r5;
                AnonymousClass037 r123 = (AnonymousClass037) obj;
                AnonymousClass0QC r14 = r55.A02;
                if (r14 == null) {
                    AnonymousClass0LW r04 = r55.A01;
                    if (r04 != null) {
                        r14 = new AnonymousClass0QB(r04);
                        r55.A02 = r14;
                    } else {
                        throw null;
                    }
                }
                r14.A02(r123);
            }
        } else if (!(this instanceof AnonymousClass0YD)) {
            throw new UnsupportedOperationException("Required method destroyItem was not overridden");
        } else {
            AnonymousClass0YD r33 = (AnonymousClass0YD) this;
            AnonymousClass037 r124 = (AnonymousClass037) obj;
            AnonymousClass0QC r22 = r33.A01;
            if (r22 == null) {
                AnonymousClass0LW r05 = r33.A03;
                if (r05 != null) {
                    r22 = new AnonymousClass0QB(r05);
                    r33.A01 = r22;
                } else {
                    throw null;
                }
            }
            r22.A02(r124);
            if (r124.equals(r33.A00)) {
                r33.A00 = null;
            }
        }
    }

    public boolean A0E(View view, Object obj) {
        if (this instanceof C08390b2) {
            return view == obj;
        }
        if (this instanceof C08410b4) {
            return view == obj;
        }
        if (this instanceof C08420b5) {
            return view == obj;
        }
        if (this instanceof C08430b6) {
            return view == obj;
        }
        if (this instanceof C08440b7) {
            return ((C08440b7) this).A00.A0E(view, obj);
        }
        if (!(this instanceof AbstractC08510bF)) {
            return ((AnonymousClass037) obj).A0A == view;
        }
        AbstractC08510bF r1 = (AbstractC08510bF) this;
        return !(r1 instanceof C75003bx) ? !(r1 instanceof AnonymousClass3Z2) ? !(r1 instanceof C08500bE) ? !(r1 instanceof C59792oI) ? view == obj : ((AnonymousClass037) obj).A0A == view : view == ((AnonymousClass02R) obj).A00 : view == obj : ((AnonymousClass037) obj).A0A == view;
    }
}
