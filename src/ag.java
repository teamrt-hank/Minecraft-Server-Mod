import java.io.PrintStream;
import java.util.Random;

public class ag extends hr
{
  public ag(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2, jr.x, false);
  }

  public ds d(el paramel, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }

  public void a(io paramio, int paramInt1, int paramInt2, int paramInt3)
  {
    float f1;
    float f2;
    if ((paramio.a(paramInt1 - 1, paramInt2, paramInt3) == this.bi) || (paramio.a(paramInt1 + 1, paramInt2, paramInt3) == this.bi)) {
      f1 = 0.5F;
      f2 = 0.125F;
      a(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, 1.0F, 0.5F + f2);
    } else {
      f1 = 0.125F;
      f2 = 0.5F;
      a(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, 1.0F, 0.5F + f2);
    }
  }

  public boolean a() {
    return false;
  }

  public boolean a_(el paramel, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    if ((paramel.a(paramInt1 - 1, paramInt2, paramInt3) == fw.aq.bi) || (paramel.a(paramInt1 + 1, paramInt2, paramInt3) == fw.aq.bi)) i = 1;
    if ((paramel.a(paramInt1, paramInt2, paramInt3 - 1) == fw.aq.bi) || (paramel.a(paramInt1, paramInt2, paramInt3 + 1) == fw.aq.bi)) j = 1;

 //   System.out.println(i + ", " + j);
    if (i == j) return false;

    if (paramel.a(paramInt1 - i, paramInt2, paramInt3 - j) == 0) {
      paramInt1 -= i;
      paramInt3 -= j;
    }

    for (int k = -1; k <= 2; ++k) {
      for (int i1 = -1; i1 <= 3; ++i1) {
        int i3 = ((k == -1) || (k == 2) || (i1 == -1) || (i1 == 3)) ? 1 : 0;
        if ((k == -1) || (k == 2)) { if (i1 == -1) continue; if (i1 == 3)
            continue; }
        int i4 = paramel.a(paramInt1 + i * k, paramInt2 + i1, paramInt3 + j * k);

        if (i3 != 0) {
          if (i4 != fw.aq.bi) return false;
        }
        else if ((i4 != 0) && (i4 != fw.as.bi)) return false;
      }

    }

    paramel.i = true;
    for (int l = 0; l < 2; ++l) {
      for (int i2 = 0; i2 < 3; ++i2) {
        paramel.d(paramInt1 + i * l, paramInt2 + i2, paramInt3 + j * l, fw.bf.bi);
      }
    }
    paramel.i = false;

    return true;
  }

  public void b(el paramel, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = 0;
    int j = 1;
    if ((paramel.a(paramInt1 - 1, paramInt2, paramInt3) == this.bi) || (paramel.a(paramInt1 + 1, paramInt2, paramInt3) == this.bi)) {
      i = 1;
      j = 0;
    }

    int k = paramInt2;
    while (paramel.a(paramInt1, k - 1, paramInt3) == this.bi) {
      --k;
    }
    if (paramel.a(paramInt1, k - 1, paramInt3) != fw.aq.bi) {
    //  paramel.d(paramInt1, paramInt2, paramInt3, 0);
      return;
    }

    int l = 1;
    while ((l < 4) && (paramel.a(paramInt1, k + l, paramInt3) == this.bi)) {
      ++l;
    }
    if ((l != 3) || (paramel.a(paramInt1, k + l, paramInt3) != fw.aq.bi)) {
 //     paramel.d(paramInt1, paramInt2, paramInt3, 0);
      return;
    }

    int i1 = ((paramel.a(paramInt1 - 1, paramInt2, paramInt3) == this.bi) || (paramel.a(paramInt1 + 1, paramInt2, paramInt3) == this.bi)) ? 1 : 0;
    int i2 = ((paramel.a(paramInt1, paramInt2, paramInt3 - 1) == this.bi) || (paramel.a(paramInt1, paramInt2, paramInt3 + 1) == this.bi)) ? 1 : 0;
    if ((i1 != 0) && (i2 != 0)) {
   //   paramel.d(paramInt1, paramInt2, paramInt3, 0);
      return;
    }

    if (((paramel.a(paramInt1 + i, paramInt2, paramInt3 + j) == fw.aq.bi) && (paramel.a(paramInt1 - i, paramInt2, paramInt3 - j) == this.bi)) || ((paramel.a(paramInt1 - i, paramInt2, paramInt3 - j) == fw.aq.bi) && (paramel.a(paramInt1 + i, paramInt2, paramInt3 + j) == this.bi))) {
      return;
    }

    // paramel.d(paramInt1, paramInt2, paramInt3, 0);
    return;
  }

  public boolean a(io paramio, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return true;
  }

  public int a(Random paramRandom) {
    return 0;
  }

  public void a(el paramel, int paramInt1, int paramInt2, int paramInt3, dv paramdv)
  {
    if (paramel.z) return;

    paramdv.C();
  }
}