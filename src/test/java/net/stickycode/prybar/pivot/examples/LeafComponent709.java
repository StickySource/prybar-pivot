package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent709
    implements PrybarComponent {

  private RootComponent709 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent709.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent709.class, "root"));
  }

  public RootComponent709 getRoot() {
    return root;
  }

}
