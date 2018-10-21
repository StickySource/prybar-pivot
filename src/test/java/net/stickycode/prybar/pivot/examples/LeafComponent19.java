package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent19
    implements PrybarComponent {

  private RootComponent19 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent19.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent19.class, "root"));
  }

  public RootComponent19 getRoot() {
    return root;
  }

}
