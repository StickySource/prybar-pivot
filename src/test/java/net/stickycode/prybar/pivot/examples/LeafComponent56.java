package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent56
    implements PrybarComponent {

  private RootComponent56 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent56.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent56.class, "root"));
  }

  public RootComponent56 getRoot() {
    return root;
  }

}
