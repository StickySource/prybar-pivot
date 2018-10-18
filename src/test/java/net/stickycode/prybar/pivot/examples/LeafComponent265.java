package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent265
    implements PrybarComponent {

  private RootComponent265 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent265.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent265.class, "root"));
  }

  public RootComponent265 getRoot() {
    return root;
  }

}
