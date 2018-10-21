package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent145
    implements PrybarComponent {

  private RootComponent145 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent145.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent145.class, "root"));
  }

  public RootComponent145 getRoot() {
    return root;
  }

}
