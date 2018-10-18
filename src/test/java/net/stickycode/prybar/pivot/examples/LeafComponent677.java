package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent677
    implements PrybarComponent {

  private RootComponent677 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent677.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent677.class, "root"));
  }

  public RootComponent677 getRoot() {
    return root;
  }

}
