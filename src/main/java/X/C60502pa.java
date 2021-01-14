package X;

import android.content.Context;
import android.graphics.Picture;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: X.2pa  reason: invalid class name and case insensitive filesystem */
public class C60502pa extends AbstractC59482nk {
    public static final Random A07 = new Random();
    public static final int[] A08 = {-9123, -532786, -798046, -2774136, -5276073, -8629442};
    public static final int[] A09 = {-1075643, -2053484, -2973577, -4748448, -7315394, -10996439};
    public int A00;
    public int A01 = 0;
    public long A02 = (A07.nextLong() % 1000);
    public Picture A03;
    public String A04;
    public String A05;
    public boolean A06;

    public C60502pa(Context context) {
        super(context);
        super.A03.setColor(0);
    }

    @Override // X.AbstractC48582Mw
    public void A0F(JSONObject jSONObject) {
        jSONObject.put("file", this.A04);
        jSONObject.put("flip", this.A06);
        jSONObject.put("palette", this.A01);
        super.A0F(jSONObject);
    }

    @Override // X.AbstractC48582Mw
    public boolean A0G(JSONObject jSONObject) {
        this.A04 = jSONObject.getString("file");
        this.A06 = jSONObject.getBoolean("flip");
        this.A01 = jSONObject.getInt("palette");
        A0H();
        if (this.A03 == null) {
            return false;
        }
        super.A0G(jSONObject);
        return true;
    }

    public final void A0H() {
        this.A03 = AbstractC59482nk.A00(((AbstractC59482nk) this).A00, this.A04);
        String str = this.A04;
        if ("e022.svg".equals(str)) {
            this.A00 = 1;
        } else if ("1f577.svg".equals(str)) {
            this.A00 = 2;
        } else if ("1f595.svg".equals(str)) {
            this.A00 = 3;
        } else if ("1f337.svg".equals(str) || "1f331.svg".equals(str)) {
            this.A00 = 4;
        }
    }
}
