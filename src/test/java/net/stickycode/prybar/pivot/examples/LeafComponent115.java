package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent115
    implements PrybarComponent {

  private RootComponent115 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent115.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent115.class, "root"));
  }

  public RootComponent115 getRoot() {
    return root;
  }

}
