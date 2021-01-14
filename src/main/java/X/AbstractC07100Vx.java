package X;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Switch;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.rendercore.text.RCTextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Vx  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC07100Vx implements AbstractC009105u {
    public static final List A05 = new ArrayList();
    public static final List A06 = new ArrayList();
    public static final List A07 = new ArrayList();
    public static final List A08 = new ArrayList();
    public static final Map A09 = new HashMap();
    public List A00;
    public List A01;
    public Map A02;
    public Map A03;
    public final AnonymousClass11D A04;

    public AbstractC07100Vx(AnonymousClass11D r5) {
        List<AnonymousClass11C> emptyList = Collections.emptyList();
        List<AnonymousClass11C> emptyList2 = Collections.emptyList();
        this.A04 = r5;
        for (AnonymousClass11C r0 : emptyList) {
            A07(r0);
        }
        for (AnonymousClass11C r2 : emptyList2) {
            List list = this.A00;
            if (list == null) {
                list = new ArrayList();
                this.A00 = list;
                if (this.A02 == null) {
                    this.A02 = new HashMap();
                } else {
                    throw new IllegalStateException("Extension Map and Extension List out of sync!");
                }
            }
            A03(this.A02, list, r2);
        }
    }

    public static void A00(List list, Context context, Object obj, Object obj2) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass11C r0 = (AnonymousClass11C) it.next();
                r0.A00.A2D(context, obj, r0.A01, obj2);
            }
        }
    }

    public static void A01(List list, Context context, Object obj, Object obj2) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                AnonymousClass11C r0 = (AnonymousClass11C) list.get(size);
                r0.A00.AQj(context, obj, r0.A01, obj2);
            }
        }
    }

    public static void A02(List list, List list2, Map map, Object obj, Object obj2, List list3, List list4) {
        Map map2 = A09;
        if (!map2.isEmpty()) {
            throw new IllegalStateException("This map is supposed to be empty!");
        } else if (list == null || list.isEmpty()) {
            if (list2 != null) {
                list3.addAll(list2);
            }
        } else if (list2 == null || list2.isEmpty()) {
            list4.addAll(list);
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AnonymousClass11C r5 = (AnonymousClass11C) it.next();
                AnonymousClass11B r3 = r5.A00;
                Class<?> cls = r3.getClass();
                AnonymousClass11C r0 = (AnonymousClass11C) map.get(cls);
                if (r0 == null) {
                    list3.add(r5);
                } else {
                    boolean APd = r3.APd(r0.A01, r5.A01, obj, obj2);
                    map2.put(cls, Boolean.valueOf(APd));
                    if (APd) {
                        list3.add(r5);
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnonymousClass11C r2 = (AnonymousClass11C) it2.next();
                Class<?> cls2 = r2.A00.getClass();
                if (!map2.containsKey(cls2) || ((Boolean) map2.get(cls2)).booleanValue()) {
                    list4.add(r2);
                }
            }
            map2.clear();
        }
    }

    public static void A03(Map map, List list, AnonymousClass11C r5) {
        Class<?> cls = r5.A00.getClass();
        if (map.put(cls, r5) != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((AnonymousClass11C) list.get(size)).A00.getClass() == cls) {
                    list.remove(size);
                }
            }
            throw new IllegalStateException("Extension Map and Extension List out of sync!");
        }
        list.add(r5);
    }

    public long A04() {
        if (this instanceof AnonymousClass278) {
            return ((AnonymousClass278) this).A01;
        }
        if (this instanceof C07090Vw) {
            return ((C07090Vw) this).A00;
        }
        if (this instanceof AnonymousClass25I) {
            return ((AnonymousClass25I) this).A0A;
        }
        if (!(this instanceof AnonymousClass25H)) {
            return 0;
        }
        return ((AnonymousClass25H) this).A02;
    }

    /* renamed from: A05 */
    public AbstractC07100Vx ABr() {
        try {
            AbstractC07100Vx r2 = (AbstractC07100Vx) super.clone();
            List list = this.A01;
            if (list != null) {
                r2.A01 = new ArrayList(list);
                r2.A03 = new HashMap(this.A03);
            }
            List list2 = this.A00;
            if (list2 != null) {
                r2.A00 = new ArrayList(list2);
                r2.A02 = new HashMap(this.A02);
            }
            return r2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Object A06(Context context) {
        if (this instanceof AnonymousClass278) {
            AbstractC25311Gi r1 = ((AnonymousClass278) this).A02;
            if (r1 instanceof C43171xu) {
                return View.inflate(context, R.layout.bloks_video_view, null);
            }
            if (r1 instanceof C43141xr) {
                return new WaImageView(context);
            }
            if (r1 instanceof C43131xq) {
                return new WaImageView(context);
            }
            if (r1 instanceof C43101xn) {
                return View.inflate(context, R.layout.wa_bloks_code_input, null);
            }
            if (r1 instanceof C43081xl) {
                return View.inflate(context, R.layout.bloks_camera_view, null);
            }
            if (r1 instanceof C43071xk) {
                return new TextEmojiLabel(context);
            }
            if (r1 instanceof C43061xj) {
                View view = new View(context);
                view.setVisibility(8);
                return view;
            } else if (r1 instanceof C43051xi) {
                return new TextEmojiLabel(context);
            } else {
                if (r1 instanceof C43041xh) {
                    return View.inflate(context, R.layout.wa_list_view, null);
                }
                if (r1 instanceof C43031xg) {
                    return View.inflate(context, R.layout.wa_bloks_text_input, null);
                }
                if (r1 instanceof C43021xf) {
                    return View.inflate(context, R.layout.date_picker, null);
                }
                if (r1 instanceof C43011xe) {
                    return View.inflate(context, R.layout.count_down_timer, null);
                }
                if (r1 instanceof C37851ot) {
                    AnonymousClass1GT r12 = new AnonymousClass1GT(context);
                    r12.setBackgroundResource(17170445);
                    return r12;
                } else if (r1 instanceof C37791on) {
                    return new ProgressBar(context);
                } else {
                    if (!(r1 instanceof C31641dZ)) {
                        return new C18410tJ(context);
                    }
                    return new Switch(context);
                }
            }
        } else if (this instanceof C07090Vw) {
            return new RCTextView(context);
        } else {
            if (this instanceof AnonymousClass25I) {
                return new RecyclerView(context, null);
            }
            if (!(this instanceof AnonymousClass25H)) {
                return null;
            }
            AnonymousClass25H r13 = (AnonymousClass25H) this;
            if (r13 instanceof AnonymousClass29Y) {
                return new AnonymousClass27B(context);
            }
            if (!(r13 instanceof AnonymousClass29Y)) {
                return new C33451gn(context);
            }
            return new AnonymousClass27B(context);
        }
    }

    public void A07(AnonymousClass11C r3) {
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
            this.A01 = list;
            if (this.A03 == null) {
                this.A03 = new HashMap();
            } else {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
        }
        A03(this.A03, list, r3);
    }
}
