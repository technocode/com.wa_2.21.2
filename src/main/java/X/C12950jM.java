package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0jM  reason: invalid class name and case insensitive filesystem */
public class C12950jM extends MenuInflater {
    public static final Class[] A04;
    public static final Class[] A05;
    public Context A00;
    public Object A01;
    public final Object[] A02;
    public final Object[] A03;

    static {
        Class[] clsArr = {Context.class};
        A05 = clsArr;
        A04 = clsArr;
    }

    public C12950jM(Context context) {
        super(context);
        this.A00 = context;
        Object[] objArr = {context};
        this.A03 = objArr;
        this.A02 = objArr;
    }

    public final Object A00(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? A00(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.view.Menu r21) {
        /*
        // Method dump skipped, instructions count: 616
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12950jM.A01(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof AnonymousClass0T9)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.A00.getResources().getLayout(i);
            A01(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
