import java.util.Random;

public class x extends cn
{
  protected x(int paramInt, iq paramiq)
  {
    super(paramInt, paramiq);

    a(false);
    if (paramiq != iq.g) return; a(true);
  }

  public void b(dy paramdy, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.b(paramdy, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramdy.a(paramInt1, paramInt2, paramInt3) == this.bc)
      i(paramdy, paramInt1, paramInt2, paramInt3);
  }

  private void i(dy paramdy, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramdy.b(paramInt1, paramInt2, paramInt3);
    paramdy.h = true;
    paramdy.a(paramInt1, paramInt2, paramInt3, this.bc - 1, i);
    paramdy.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    paramdy.h(paramInt1, paramInt2, paramInt3, this.bc - 1);
    paramdy.h = false;
  }

  public void a(dy paramdy, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.bn == iq.g) {
      int i = paramRandom.nextInt(3);
      for (int j = 0; j < i; j++) {
        paramInt1 += paramRandom.nextInt(3) - 1;
        paramInt2++;
        paramInt3 += paramRandom.nextInt(3) - 1;
        int k = paramdy.a(paramInt1, paramInt2, paramInt3);
        if (k == 0)
        {
          if ((j(paramdy, paramInt1 - 1, paramInt2, paramInt3)) || (j(paramdy, paramInt1 + 1, paramInt2, paramInt3)) || (j(paramdy, paramInt1, paramInt2, paramInt3 - 1)) || (j(paramdy, paramInt1, paramInt2, paramInt3 + 1)) || (j(paramdy, paramInt1, paramInt2 - 1, paramInt3)) || (j(paramdy, paramInt1, paramInt2 + 1, paramInt3)))
          {
            return;
          }
        }
        else if (ff.n[k].bn.c())
          return;
      }
    }
  }

  private boolean j(dy paramdy, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramdy.c(paramInt1, paramInt2, paramInt3).e();
  }
}

/* Location:           C:\Users\mrsheen\Downloads\llamacraft3.6 (1)\
 * Qualified Name:     x
 * JD-Core Version:    0.6.0
 */