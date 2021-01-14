package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1o4  reason: invalid class name and case insensitive filesystem */
public class C37351o4 implements AbstractC011006p {
    public final AbstractC011006p A00;

    public C37351o4(AbstractC011006p r1) {
        this.A00 = r1;
    }

    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static String A01(AbstractC011306t r1) {
        if (r1 instanceof AnonymousClass27D) {
            return r1.toString();
        }
        if (r1 instanceof AnonymousClass27G) {
            return String.valueOf(C008805h.A0a(r1));
        }
        return r1.toString();
    }

    public static String A02(AbstractC011306t r2, boolean z) {
        if (r2 instanceof AnonymousClass27G) {
            Object A0a = C008805h.A0a(r2);
            if ((A0a instanceof List) || (A0a instanceof Map)) {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                try {
                    A05(r2, jsonWriter, z);
                    jsonWriter.close();
                    return stringWriter.toString();
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Exception in serialization ");
                    sb.append(e);
                    return sb.toString();
                }
            } else if (A0a == null) {
                return "";
            }
        }
        return A01(r2);
    }

    public static ArrayList A03(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                arrayList.add(C008805h.A0T(obj));
            } else if (obj instanceof JSONObject) {
                arrayList.add(C008805h.A0T(A04((JSONObject) obj)));
            } else if (obj instanceof JSONArray) {
                arrayList.add(C008805h.A0T(A03((JSONArray) obj)));
            } else if (obj instanceof Integer) {
                arrayList.add(new C463229b((double) ((Number) obj).intValue()));
            } else if (obj instanceof Double) {
                arrayList.add(new C463229b(((Number) obj).doubleValue()));
            } else if (obj instanceof Float) {
                arrayList.add(new C463229b((double) ((Number) obj).floatValue()));
            } else if (obj instanceof Boolean) {
                arrayList.add(new C463229b(((Boolean) obj).booleanValue() ? 1.0d : 0.0d));
            } else if (obj instanceof Long) {
                arrayList.add(new C463329c(((Number) obj).longValue()));
            }
        }
        return arrayList;
    }

    public static HashMap A04(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            AbstractC011306t A0T = C008805h.A0T(next);
            if (obj instanceof String) {
                hashMap.put(A0T, C008805h.A0T(obj));
            } else if (obj instanceof JSONObject) {
                hashMap.put(A0T, C008805h.A0T(A04((JSONObject) obj)));
            } else if (obj instanceof JSONArray) {
                hashMap.put(A0T, C008805h.A0T(A03((JSONArray) obj)));
            } else if (obj instanceof Integer) {
                hashMap.put(A0T, new C463229b((double) ((Number) obj).intValue()));
            } else if (obj instanceof Double) {
                hashMap.put(A0T, new C463229b(((Number) obj).doubleValue()));
            } else if (obj instanceof Float) {
                hashMap.put(A0T, new C463229b((double) ((Number) obj).floatValue()));
            } else if (obj instanceof Boolean) {
                hashMap.put(A0T, new C463229b(((Boolean) obj).booleanValue() ? 1.0d : 0.0d));
            } else if (obj instanceof Long) {
                hashMap.put(A0T, new C463329c(((Number) obj).longValue()));
            }
        }
        return hashMap;
    }

    public static void A05(AbstractC011306t r4, JsonWriter jsonWriter, boolean z) {
        if (r4 instanceof AnonymousClass27D) {
            jsonWriter.value((Number) r4);
        } else if (r4 instanceof AnonymousClass27G) {
            Object A0a = C008805h.A0a(r4);
            if (A0a instanceof String) {
                jsonWriter.value((String) A0a);
            } else if (A0a instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    for (Map.Entry entry : ((Map) A0a).entrySet()) {
                        treeMap.put(A01((AbstractC011306t) entry.getKey()), entry.getValue());
                    }
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        jsonWriter.name((String) entry2.getKey());
                        A05((AbstractC011306t) entry2.getValue(), jsonWriter, z);
                    }
                } else {
                    for (Map.Entry entry3 : ((Map) A0a).entrySet()) {
                        jsonWriter.name(A01((AbstractC011306t) entry3.getKey()));
                        A05((AbstractC011306t) entry3.getValue(), jsonWriter, z);
                    }
                }
                jsonWriter.endObject();
            } else if (A0a instanceof List) {
                jsonWriter.beginArray();
                for (AbstractC011306t r0 : (List) A0a) {
                    A05(r0, jsonWriter, z);
                }
                jsonWriter.endArray();
            } else if (A0a == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(String.valueOf(A0a));
            }
        } else {
            jsonWriter.value(String.valueOf(r4));
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1.equals("bk.action.bloks.DangerouslyGetTreeFromParseResult") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r1.equals("bk.action.bloks.IndexOfChild") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r1.equals("bk.action.bloks.Find") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r1.equals("bk.action.currency.CurrencyToString") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r1.equals("bk.action.bloks.FindContainer") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r1.equals("bk.action.bloks.InsertChildrenAfter") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0744, code lost:
        if (r3 != 0) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r1.equals("bk.action.bloks.DismissKeyboard") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        X.C008805h.A0Q(r3, X.C010106g.A01, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x07e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x07e7, code lost:
        X.AnonymousClass112.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x07ea, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r1.equals("bk.action.bloks.AddChild") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r1.equals("bk.action.bloks.ParseEmbedded") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r1.equals("bk.action.bloks.Reduce") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r1.equals("bk.action.bloks.Reflow") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if (r1.equals("bk.action.bloks.Inflate") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r1.equals("bk.action.bloks.AppendChildren") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (r1.equals("bk.action.bloks.ShowKeyboard") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        if (r1.equals("bk.action.component.GetHeight") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (r1.equals("bk.action.bloks.GetVariable2") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        if (r1.equals("bk.action.bloks.ChildAtIndex") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e8, code lost:
        if (r1.equals("bk.action.collection.ScrollToIndexById") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f4, code lost:
        if (r1.equals("bk.action.string.JsonDecode") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r1.equals("bk.action.string.JsonEncode") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010b, code lost:
        if (r1.equals("bk.action.bloks.FindWidget") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0117, code lost:
        if (r1.equals("bk.action.bloks.ReplaceChild") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0123, code lost:
        if (r1.equals("bk.action.bloks.ReplaceChildrenAfter") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012f, code lost:
        if (r1.equals("bk.action.collection.SetIndexById") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013b, code lost:
        if (r1.equals("bk.action.string.JsonEncodeV2") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0147, code lost:
        if (r1.equals("bk.action.bloks.InflateSync") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0153, code lost:
        if (r1.equals("bk.action.bloks.InsertChildrenBefore") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015f, code lost:
        if (r1.equals("bk.action.bloks.WriteGlobalConsistencyStore") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016b, code lost:
        if (r1.equals("bk.action.textinput.GetText") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0176, code lost:
        if (r1.equals("bk.action.bloks.RemoveChildrenBetween") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0182, code lost:
        if (r1.equals("bk.action.string.FromProvider") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018e, code lost:
        if (r1.equals("bk.action.bloks.RequestFocus") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019a, code lost:
        if (r1.equals("bk.action.collection.SetIndex") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a5, code lost:
        if (r1.equals("bk.action.bloks.RemoveChildAt") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b1, code lost:
        if (r1.equals("bk.action.bloks.WriteLocalState") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bd, code lost:
        if (r1.equals("bk.action.component.SetAttr") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c9, code lost:
        if (r1.equals("bk.action.bloks.RemoveChild") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d5, code lost:
        if (r1.equals("bk.action.text.GetText") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e0, code lost:
        if (r1.equals("bk.action.bloks.PrependChildren") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ec, code lost:
        if (r1.equals("bk.action.component.GetWidth") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f8, code lost:
        if (r1.equals("bk.action.bloks.GetState") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0204, code lost:
        if (r1.equals("bk.action.bloks.ReplaceEmbeddedChild") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0210, code lost:
        if (r1.equals("bk.action.bloks.ReplaceChildren") == false) goto L_0x000e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:230:0x07db */
    @Override // X.AbstractC011006p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC011306t A49(X.C38151pP r13, X.C010106g r14, X.C011106q r15) {
        /*
        // Method dump skipped, instructions count: 3324
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37351o4.A49(X.1pP, X.06g, X.06q):X.06t");
    }
}
