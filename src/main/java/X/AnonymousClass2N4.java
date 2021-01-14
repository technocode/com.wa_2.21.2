package X;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2N4  reason: invalid class name */
public class AnonymousClass2N4 {
    public final LinkedList A00 = new LinkedList();

    public AbstractC48582Mw A00(List list) {
        LinkedList linkedList = this.A00;
        if (linkedList.isEmpty()) {
            return null;
        }
        AnonymousClass2N3 r3 = (AnonymousClass2N3) linkedList.removeLast();
        if (r3 instanceof C53282cp) {
            C53282cp r0 = (C53282cp) r3;
            AbstractC48582Mw r2 = ((AnonymousClass2N3) r0).A00;
            C48572Mv r5 = r0.A00;
            if (!(r2 instanceof C53232ck)) {
                r2.A04.set(r5.A03);
                r2.A00 = r5.A00;
                r2.A08(r5.A02);
                r2.A06(r5.A01);
            } else {
                C53232ck r22 = (C53232ck) r2;
                ((AbstractC48582Mw) r22).A04.set(r5.A03);
                ((AbstractC48582Mw) r22).A00 = r5.A00;
                r22.A08(r5.A02);
                r22.A06(r5.A01);
                C53222cj r52 = (C53222cj) r5;
                r22.A0J(r52.A01, r52.A00);
            }
        } else if (r3 instanceof C53272co) {
            C53272co r02 = (C53272co) r3;
            list.add(r02.A00, ((AnonymousClass2N3) r02).A00);
        } else if (!(r3 instanceof C53262cn)) {
            list.remove(r3.A00);
        } else {
            C53262cn r23 = (C53262cn) r3;
            list.remove(((AnonymousClass2N3) r23).A00);
            list.add(r23.A00, ((AnonymousClass2N3) r23).A00);
        }
        if ((r3 instanceof C53272co) && !linkedList.isEmpty()) {
            AnonymousClass2N3 r1 = (AnonymousClass2N3) linkedList.getLast();
            if ((r1 instanceof C53282cp) && r1.A00 == r3.A00) {
                A00(list);
            }
            return null;
        } else if (r3 instanceof C53252cm) {
            return r3.A00;
        } else {
            return null;
        }
    }

    public String A01(List list) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass2N3 r5 = (AnonymousClass2N3) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("shape_index", list.indexOf(r5.A00));
            if (!(r5 instanceof C53282cp)) {
                str = !(r5 instanceof C53272co) ? !(r5 instanceof C53262cn) ? "undo_add_shape" : "undo_change_z_order" : "undo_delete_shape";
            } else {
                str = "undo_modify_shape";
            }
            jSONObject2.put("type", str);
            if (r5 instanceof C53282cp) {
                C53282cp r52 = (C53282cp) r5;
                jSONObject2.put("color", r52.A00.A02);
                jSONObject2.put("rotate", (double) r52.A00.A00);
                jSONObject2.put("strokeWidth", (double) r52.A00.A01);
                jSONObject2.put("left", (double) r52.A00.A03.left);
                jSONObject2.put("right", (double) r52.A00.A03.right);
                jSONObject2.put("top", (double) r52.A00.A03.top);
                jSONObject2.put("bottom", (double) r52.A00.A03.bottom);
            } else if (r5 instanceof C53272co) {
                jSONObject2.put("index", ((C53272co) r5).A00);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("actions", jSONArray);
        return jSONObject.toString();
    }

    public void A02(String str, List list) {
        char c;
        AnonymousClass2N3 r5;
        JSONArray jSONArray = new JSONObject(str).getJSONArray("actions");
        LinkedList linkedList = this.A00;
        linkedList.clear();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("type");
            switch (string.hashCode()) {
                case 49116392:
                    if (string.equals("undo_add_shape")) {
                        c = 0;
                        break;
                    } else {
                        continue;
                    }
                case 1021915016:
                    if (string.equals("undo_delete_shape")) {
                        c = 1;
                        break;
                    } else {
                        continue;
                    }
                case 1953129077:
                    if (string.equals("undo_change_z_order")) {
                        c = 3;
                        break;
                    } else {
                        continue;
                    }
                case 1971936087:
                    if (string.equals("undo_modify_shape")) {
                        c = 2;
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            if (c == 0) {
                r5 = new C53252cm();
            } else if (c == 1) {
                r5 = new C53272co();
            } else if (c == 2) {
                r5 = new C53282cp();
            } else if (c == 3) {
                r5 = new C53262cn();
            }
            if (r5 instanceof C53282cp) {
                RectF rectF = new RectF();
                rectF.left = (float) jSONObject.getDouble("left");
                rectF.right = (float) jSONObject.getDouble("right");
                rectF.top = (float) jSONObject.getDouble("top");
                rectF.bottom = (float) jSONObject.getDouble("bottom");
                ((C53282cp) r5).A00 = new C48572Mv(rectF, (float) jSONObject.getDouble("rotate"), jSONObject.getInt("color"), (float) jSONObject.getDouble("strokeWidth"));
            } else if (r5 instanceof C53272co) {
                ((C53272co) r5).A00 = jSONObject.getInt("index");
            }
            int i2 = jSONObject.getInt("shape_index");
            if (i2 >= 0 && i2 < list.size()) {
                r5.A00 = (AbstractC48582Mw) list.get(i2);
                linkedList.add(r5);
            }
        }
    }
}
