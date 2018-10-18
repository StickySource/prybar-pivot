package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent365
    implements PrybarComponent {

  private RootComponent365 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent365.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent365.class, "root"));
  }

  public RootComponent365 getRoot() {
    return root;
  }

}
