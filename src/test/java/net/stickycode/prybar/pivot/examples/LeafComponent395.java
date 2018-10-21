package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent395
    implements PrybarComponent {

  private RootComponent395 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent395.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent395.class, "root"));
  }

  public RootComponent395 getRoot() {
    return root;
  }

}
