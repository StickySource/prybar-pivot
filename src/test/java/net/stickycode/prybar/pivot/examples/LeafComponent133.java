package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent133
    implements PrybarComponent {

  private RootComponent133 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent133.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent133.class, "root"));
  }

  public RootComponent133 getRoot() {
    return root;
  }

}
