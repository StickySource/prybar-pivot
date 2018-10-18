package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent761
    implements PrybarComponent {

  private RootComponent761 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent761.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent761.class, "root"));
  }

  public RootComponent761 getRoot() {
    return root;
  }

}
